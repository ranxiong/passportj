package core.util.generated.random;

import core.util.generated.IRandom;

import java.util.Random;

/**
 * Created by panyao on 15/10/11.
 */
public class StringRandom implements IRandom {

    // 数字，小写字母，大写字母
    private static final String cells = NUMERIC_CELLS + CHARACTER_CELLS + CHARACTER_UPPER_CELLS;
    private static final byte size = 4;

    @Override
    public String generated() {
        return this.random(cells, size);
    }

    @Override
    public String generated(byte size) {
        return this.random(cells, size);
    }

    @Override
    public String generated(String cells) {
        return this.random(cells, size);
    }

    @Override
    public String generated(String cells, byte size) {
        return this.random(cells, size);
    }

    private String random(String cells, byte size) {
        char[] chars = cells.toCharArray();
        int charLength = chars.length;
        Random random = new Random(charLength);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < charLength; i++) {
            stringBuffer.append(chars[random.nextInt()]);
        }
        return stringBuffer.toString();
    }

}
