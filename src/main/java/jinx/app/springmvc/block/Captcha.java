package jinx.app.springmvc.block;

/**
 * Created by Administrator on 2015/12/4.
 */

import jinx.app.context.session.TokenSession;
import jinx.core.layer.captcha.CaptchaValue;
import jinx.core.layer.captcha.ImageCaptcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 验证码 改接口返回
 */
@Controller
@RequestMapping("/api/captcha")
public class Captcha {

    @RequestMapping(method = RequestMethod.GET)
    public void GET(HttpServletResponse response) throws IOException {
        ImageCaptcha imageCaptcha = new ImageCaptcha();
        CaptchaValue<BufferedImage> cv = imageCaptcha.generated(new TokenSession().getSessionId());
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream = response.getOutputStream();
        ImageIO.write(cv.get_outputStream(), "jpeg", responseOutputStream);
        responseOutputStream.close();
        responseOutputStream.flush();
    }

    @RequestMapping(method = RequestMethod.POST)
    public String POST(@RequestParam String code) {


        return "login success......";
    }

}
