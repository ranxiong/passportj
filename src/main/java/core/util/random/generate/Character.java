package core.util.random.generate;

import core.util.random.IGenerate;

import java.util.Random;

/**
 * Created by panyao on 15/10/11.
 */
public class Character implements IGenerate {

    private String charString = "acbdefghijklmnopqrstuvwxyz";

    private int length = 4;

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void set(String string) {
        this.charString = string;
    }

    @Override
    public String random() {

        char[] chars = charString.toCharArray();

        int charLength = chars.length;

        Random random = new Random(charLength);

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < length; i++) {
            stringBuffer.append(chars[random.nextInt()]);
        }

        return stringBuffer.toString();
    }
}
