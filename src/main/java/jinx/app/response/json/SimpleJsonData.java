package jinx.app.response.json;

import jinx.app.response.IErrorThrowable;
import jinx.app.response.IResponseJson;

import java.util.List;

/**
 * Created by Administrator on 2016/1/15.
 */
public class SimpleJsonData implements IResponseJson {

    @Override
    public String toResponse() {
        return null;
    }

    @Override
    public String toResponse(IErrorThrowable iErrorThrowable) {
        return null;
    }

    @Override
    public String toResponse(int error_code, String message) {
        return null;
    }

    @Override
    public String toResponse(List<Object> data) {
        return null;
    }
}
