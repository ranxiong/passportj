package core.layer.captcha;

/**
 * Created by Administrator on 2016/1/15.
 */
public class CaptchaValue<T> {
    private String _uniqueKey;
    private String _code;
    private short _TTL;
    private T _outputStream;

    public CaptchaValue(String uniqueKey, String code, short TTL, T outputStream) {
        _uniqueKey = uniqueKey;
        _code = code;
        _TTL = TTL;
        _outputStream = outputStream;
    }

    public T get_outputStream() {
        return _outputStream;
    }

    public String get_uniqueKey() {
        return _uniqueKey;
    }

    public String get_code() {
        return _code;
    }

    public short get_TTL() {
        return _TTL;
    }
}
