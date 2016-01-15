package core.block.captcha;

import core.block.ICaptcha;
import core.util.generated.IRandom;

/**
 * Created by Administrator on 2016/1/15.
 */
public class ImageCaptcha extends AbstractCaptcha implements ICaptcha {

    @Override
    public void setTTL(short TTL) {

    }

    @Override
    public CaptchaValue generated() {
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
