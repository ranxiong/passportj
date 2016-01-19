package jinx.core.util.generated.random;

import jinx.core.util.generated.IRandom;

import java.util.Random;

/**
 * Created by panyao on 15/10/11.
 */
public class StringRandom implements IRandom {

    // 数字，小写字母，大写字母
    private static final String _CELLS = NUMERIC_CELLS + CHARACTER_CELLS + CHARACTER_UPPER_CELLS;
    private static final byte _SIZE = 4;

    @Override
    public String generated() {
        return this._random(_CELLS, _SIZE);
    }

    @Override
    public String generated(byte size) {
        return this._random(_CELLS, size);
    }

    @Override
    public String generated(String cells) {
        return this._random(cells, _SIZE);
    }

    @Override
    public String generated(String cells, byte size) {
        return this._random(cells, size);
    }

    private String _random(String cells, byte size) {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (byte i = 0; i < size; i++) {
            stringBuffer.append(cells.charAt(random.nextInt(cells.length() - 1)));
        }
        return stringBuffer.toString();
    }

}
