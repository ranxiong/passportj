package jinx.app.request;

import jinx.app.IConfigConstants;
import jinx.core.util.JinxDigest;
import jinx.core.util.sort.MapSort;

import javax.servlet.http.HttpServletRequest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * Created by Administrator on 2016/1/22.
 */
public class Signature {
    public final static String SIGNATURE_TIME = "_time";
    public final static String SIGNATURE_SIGN = "_sign";

    public static boolean verify(Map<String, String> params) throws NoSuchAlgorithmException {
        if (false == params.containsKey(SIGNATURE_TIME)) {
            // TODO 必须key保存，抛出异常
        }
        if (false == params.containsKey(SIGNATURE_SIGN)) {
            // TODO 必须key保存，抛出异常
        }
        String time = params.remove(SIGNATURE_TIME);
        String sign = params.remove(SIGNATURE_SIGN);

        return make(params, time, IConfigConstants.SIGNATURE_APP_ID_VALUE,
                IConfigConstants.SIGNATURE_APP_SECRET_KEY_VALUE)
                .equals(sign);
    }

    public static String make(Map<String, String> params,
                       String timestamp, String appId, String appSecretKey) throws NoSuchAlgorithmException {
        Map<String, String> sortedMap = MapSort.kSort(params);
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, String> entry : sortedMap.entrySet()
                ) {
            sb.append(entry.getKey() + "=" + entry.getValue());
        }
        return JinxDigest.encryptHexSHA1(
                JinxDigest.encryptHexSHA1(sb.toString()) +
                        timestamp +
                        appId +
                        appSecretKey);
    }

}
