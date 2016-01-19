package core.app.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/1/15.
 */
public interface IResponseJson {
    String JSON_ERROR_CODE = "code";
    String JSON_MESSAGE = "message";
    String JSON_TIMESTAMP = "timestamp";
    String JSON_DATA = "data";
    HashMap<String, Object> JSON_TEMP = new HashMap<String, Object>() {
        {
            put(JSON_ERROR_CODE, 1);
            put(JSON_MESSAGE, "success");
            put(JSON_TIMESTAMP, System.currentTimeMillis());
            put(JSON_DATA, new ArrayList<Object>());
        }
    };

    public String toResponse();

    public String toResponse(IErrorThrowable iErrorThrowable);

    public String toResponse(int error_code, String message);

    public String toResponse(List<Object> data);
}
