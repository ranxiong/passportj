package jinx.core.layer;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2016/1/21.
 */
public final class Signature {

    public final static String SIGNATURE_TIME = "_time";
    public final static String SIGNATURE_SIGN = "_sign";

    public void verify(){

    }

    public static String makeSign(Map<String, String> queryMap, String appKey, String appSecret){
        String time = queryMap.get(SIGNATURE_TIME);
        queryMap.remove(SIGNATURE_TIME);

        Map<String, String> treeMap = new TreeMap<String, String>();

        return "";
    }

}
