package jinx.app.request;

import jinx.core.util.JinxDigest;

import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * Created by Administrator on 2016/1/22.
 */
public class OAuth {
    public final static String HTTP_TOKEN_PARAM_NAME = "_token";
    // _token == null 表示匿名用户
    private String _token = null;

    public OAuth(String token) {
        _token = token;
        if (null != token) {
            _validation(token);
        }
    }

    // 生成一个token
    public String makeToken() throws NoSuchAlgorithmException {
        return JinxDigest.encryptHexSHA1(UUID.randomUUID().toString());
    }

    public boolean isAnonymous() {
        return null == _token ? true : false;
    }

    public boolean isLogin() {
        return true;
    }

    private boolean _validation(String token) {

        return true;
    }


}
