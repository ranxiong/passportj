package core.app.springmvc.block;

/**
 * Created by Administrator on 2015/12/4.
 */

import core.block.captcha.ImageCaptcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 验证码 改接口返回
 */
@Controller
@RequestMapping("/api/captcha")
public class Captcha {

    @RequestMapping( method = RequestMethod.GET)
    public String GET() {
        ImageCaptcha imageCaptcha = new ImageCaptcha();
        imageCaptcha.generated();

        return "login success......";
    }

    @RequestMapping( method = RequestMethod.POST)
    public String POST(@RequestParam String code) {


        return "login success......";
    }

}
