package core.block.captcha;

import core.block.ICaptcha;
import core.util.generated.IRandom;

/**
 * Created by Administrator on 2016/1/15.
 */
public class ImageCaptcha extends AbstractCaptcha implements ICaptcha {

    @Override
    public CaptchaValue generated(String key) {
        return null;
    }

    @Override
    public CaptchaValue generated(String key, short TTL) {
        return null;
    }

    @Override
    public CaptchaValue generated(String key, CAPTCHA_TYPE type) {
        return null;
    }

    @Override
    public CaptchaValue generated(String key, CAPTCHA_TYPE type, short TTL) {
        return null;
    }

    @Override
    public boolean verify(String key) {
        return false;
    }

    @Override
    public boolean delete(String key) {
        return false;
    }
}
