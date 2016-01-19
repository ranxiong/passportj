package jinx.block.captcha;

import jinx.core.layer.captcha.CaptchaValue;
import jinx.core.layer.captcha.ImageCaptcha;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.image.BufferedImage;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/1/19.
 */
public class ImageCaptchaTest {

    private ImageCaptcha ic = null;
    private String uniqueKey = "";
    private String temp_code = "";

    @Before
    public void setUp() throws Exception {
        ic = new ImageCaptcha();
        uniqueKey = "'test_uniquerkes'";
    }

    @Test
    @Before
    public void testGenerated() throws Exception {
        CaptchaValue<BufferedImage> cv = ic.generated(uniqueKey);
        temp_code = cv.get_code();

        // 保证是目标的验证码
        assertTrue(uniqueKey.equals(cv.get_uniqueKey()));
    }

    @Test
    @After
    public void testVerify() throws Exception {
        ic.verify(uniqueKey, temp_code);
    }

    @Test
    public void testDelete() throws Exception {

    }
}