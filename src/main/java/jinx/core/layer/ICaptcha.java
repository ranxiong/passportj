package jinx.core.layer;

import jinx.core.layer.captcha.CaptchaValue;

/**
 * Created by Administrator on 2016/1/15.
 */
public interface ICaptcha {

    byte NUMBER_CAPTCHA = 0;            // 数字类型
    byte LETTER_CAPTCHA = 1;            // 小写字母类型
    byte LETTER_UPPER_CAPTCHA = 2;     // 大写字母类型
    byte DICTIONARY_CAPTCHA = 3;       // 字典类型
    byte MIX_CAPTCHA = 4;               // 数字大小写字母混合类型

    enum CAPTCHA_TYPE {
        NUMBER_CAPTCHA, LETTER_CAPTCHA, DICTIONARY_CAPTCHA, MIX_CAPTCHA
    }



    /**
     * 生成一个验证码 返回验证码值对象
     *
     * @return
     */
    CaptchaValue generated(String uniqueKey);

    CaptchaValue generated(String uniqueKey, byte size);

    /**
     * 生成一个验证码，设置过期时间 返回验证码值对象
     *
     * @return
     */
    CaptchaValue generated(String uniqueKey, short TTL);

    CaptchaValue generated(String uniqueKey, byte size, short TTL);


    /**
     * 生成一个验证码, 选择验证码类型 返回验证码值对象
     *
     * @return
     */
    CaptchaValue generated(String uniqueKey, CAPTCHA_TYPE type);

    CaptchaValue generated(String uniqueKey, CAPTCHA_TYPE type, byte size);

    /**
     * 生成一个验证码, 选择验证码类型，设置过期时间 返回验证码值对象
     *
     * @return
     */
    CaptchaValue generated(String uniqueKey, CAPTCHA_TYPE type, short TTL);

    CaptchaValue generated(String uniqueKey, CAPTCHA_TYPE type, byte size ,short TTL);

    /**
     * 验证验证码
     *
     * @return
     */
    boolean verify(String uniqueKey, String code);

    /**
     * 删除一个验证码
     *
     * @return
     */
    boolean delete(String uniqueKey);

}
