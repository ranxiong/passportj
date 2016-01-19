package core.layer.captcha;

import core.layer.ICaptcha;

/**
 * Created by Administrator on 2016/1/15.
 */
public class TelephoneCaptcha extends AbstractCaptcha implements ICaptcha {
    @Override
    public CaptchaValue generated(String uniqueKey) {
        return null;
    }

    @Override
    public CaptchaValue generated(String uniqueKey, byte size) {
        return null;
    }

    @Override
    public CaptchaValue generated(String uniqueKey, short TTL) {
        return null;
    }

    @Override
    public CaptchaValue generated(String uniqueKey, byte size, short TTL) {
        return null;
    }

    @Override
    public CaptchaValue generated(String uniqueKey, CAPTCHA_TYPE type) {
        return null;
    }

    @Override
    public CaptchaValue generated(String uniqueKey, CAPTCHA_TYPE type, byte size) {
        return null;
    }

    @Override
    public CaptchaValue generated(String uniqueKey, CAPTCHA_TYPE type, short TTL) {
        return null;
    }

    @Override
    public CaptchaValue generated(String uniqueKey, CAPTCHA_TYPE type, byte size, short TTL) {
        return null;
    }

    @Override
    public boolean verify(String uniqueKey, String code) {
        return false;
    }

    @Override
    public boolean delete(String uniqueKey) {
        return false;
    }
}
