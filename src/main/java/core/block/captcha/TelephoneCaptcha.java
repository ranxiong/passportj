package core.block.captcha;

import core.block.ICaptcha;

/**
 * Created by Administrator on 2016/1/15.
 */
public class TelephoneCaptcha extends AbstractCaptcha implements ICaptcha {
    @Override
    public void setTTL(short TTL) {

    }

    @Override
    public CaptchaValue generate() {
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
