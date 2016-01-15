package core.block;

import core.block.captcha.CaptchaValue;

/**
 * Created by Administrator on 2016/1/15.
 */
public interface ICaptcha {

    byte NUMBER_CAPTCHA = 0;        // 数字类型
    byte LETTER_CAPTCHA = 1;        // 字母类型
    byte DICTIONARY_CAPTCHA = 2;   // 字典类型
    byte MIX_CAPTCHA = 3;           // 数字字母混合类型

    /**
     * 设置验证码的活性周期
     * @param TTL
     */
    public void setTTL(short TTL);

    /**
     * 生成一个验证码 返回验证码值对象
     *
     * @return
     */
    public CaptchaValue generate();

    /**
     * 验证验证码
     * @return
     */
    public boolean verify();

    /**
     * 删除一个验证码
     * @return
     */
    public boolean delete();

}
