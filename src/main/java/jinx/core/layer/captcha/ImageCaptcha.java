package jinx.core.layer.captcha;

import jinx.core.layer.ICaptcha;
import jinx.core.util.generated.IRandom;
import jinx.core.util.generated.random.StringRandom;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * Created by Administrator on 2016/1/15.
 */
public class ImageCaptcha extends AbstractCaptcha implements ICaptcha {

    @Override
    public CaptchaValue<BufferedImage> generated(String uniqueKey) {
        return _buildKey(uniqueKey, _generatedCode(CAPTCHA_TYPE.MIX_CAPTCHA, __SIZE), __TTL);
    }

    @Override
    public CaptchaValue<BufferedImage> generated(String uniqueKey, byte size) {
        return _buildKey(uniqueKey, _generatedCode(CAPTCHA_TYPE.MIX_CAPTCHA, size), __TTL);
    }

    @Override
    public CaptchaValue<BufferedImage> generated(String uniqueKey, short TTL) {
        return _buildKey(uniqueKey, _generatedCode(CAPTCHA_TYPE.MIX_CAPTCHA, __SIZE), TTL);
    }

    @Override
    public CaptchaValue generated(String uniqueKey, byte size, short TTL) {
        return _buildKey(uniqueKey, _generatedCode(CAPTCHA_TYPE.MIX_CAPTCHA, size), TTL);
    }

    @Override
    public CaptchaValue<BufferedImage> generated(String uniqueKey, CAPTCHA_TYPE type) {
        return _buildKey(uniqueKey, _generatedCode(type, __SIZE), __TTL);
    }

    @Override
    public CaptchaValue<BufferedImage> generated(String uniqueKey, CAPTCHA_TYPE type, short TTL) {
        return _buildKey(uniqueKey, _generatedCode(type, __SIZE), TTL);
    }

    @Override
    public CaptchaValue generated(String uniqueKey, CAPTCHA_TYPE type, byte size) {
        return _buildKey(uniqueKey, _generatedCode(type, size), __TTL);
    }

    @Override
    public CaptchaValue generated(String uniqueKey, CAPTCHA_TYPE type, byte size, short TTL) {
        return _buildKey(uniqueKey, _generatedCode(type, size), TTL);
    }

    @Override
    public boolean verify(String uniqueKey, String code) {
        return false;
    }

    @Override
    public boolean delete(String uniqueKey) {
        return false;
    }

    private String _generatedCode(CAPTCHA_TYPE type, byte size) {
        StringRandom sr = new StringRandom();

//        switch (type.toString()){
//            case CAPTCHA_TYPE.NUMBER_CAPTCHA:
//
//                break;
//            case CAPTCHA_TYPE.LETTER_CAPTCHA:break;
//            case CAPTCHA_TYPE.DICTIONARY_CAPTCHA:break;
//            case CAPTCHA_TYPE.MIX_CAPTCHA:break;
//        }

        if (CAPTCHA_TYPE.NUMBER_CAPTCHA == type) {
            return sr.generated(IRandom.NUMERIC_CELLS, size);
        }else if(CAPTCHA_TYPE.LETTER_CAPTCHA == type){
            return sr.generated(IRandom.CHARACTER_CELLS, size);
        }else if(CAPTCHA_TYPE.DICTIONARY_CAPTCHA == type){
            // TODO un support
            return null;
        }else if(CAPTCHA_TYPE.MIX_CAPTCHA == type){
            return sr.generated(size);
        }
        return null;
    }

    private void _buildContainer(String uniqueKey, String code){

    }

    private CaptchaValue<BufferedImage> _buildKey(String uniqueKey, String code, short TTL) {
        // TODO 把验证码绑定到可以储存的容器 这里先不要做
        _buildContainer(uniqueKey, code);
        return new CaptchaValue<BufferedImage>(uniqueKey, code, TTL, _drawImage(code));
    }


    /**
     * TODO web 项目涉及的图形操作并不多，所以这里不做设计，直接一锅端
     * @param code
     * @return
     */
    private BufferedImage _drawImage(String code) {
        short width = 80;
        short height = 25;

        BufferedImage buffImg = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        Graphics g = buffImg.createGraphics();
        // 将图像填充为白色
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        // 创建字体，字体的大小应该根据图片的高度来定."Times New Roman"/Fixedsys, Font.PLAIN, 20
        Font font = new Font("Fixedsys", Font.PLAIN, 20);

        // 设置字体。
        g.setFont(font);

        // 画边框。
        g.setColor(Color.BLACK);
        g.drawRect(11, 0, width - 12, height - 1);
        Random random = new Random();

        int red = 0, green = 0, blue = 0;
        for (char c : code.toCharArray()) {
            // 产生随机的颜色分量来构造颜色值，这样输出的每位数字的颜色值都将不同。
            red = random.nextInt(255);
            green = random.nextInt(255);
            blue = random.nextInt(255);

            // 用随机产生的颜色将验证码绘制到图像中。
            g.setColor(new Color(red, green, blue));
            g.drawString(c + "", (red + 1) * (width / (code.length() + 1)), height - 4);
        }
        return buffImg;
    }
}