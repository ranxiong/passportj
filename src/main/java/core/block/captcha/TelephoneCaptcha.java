package core.block.captcha;

import core.block.ICaptcha;

/**
 * Created by Administrator on 2016/1/15.
 */
public class TelephoneCaptcha extends AbstractCaptcha implements ICaptcha {
    @Override
    public CaptchaValue generated() {
        return null;
    }

    @Override
    public CaptchaValue generated(short TTL) {
        return null;
    }

    @Override
    public CaptchaValue generated(CAPTCHA_TYPE type) {
        return null;
    }

    @Override
    public CaptchaValue generated(CAPTCHA_TYPE type, short TTL) {
        return null;
    }

    @Override
    public boolean verify() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }
}
