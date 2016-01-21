package jinx.app.response.error;

import jinx.app.response.IErrorThrowable;

/**
 * Created by Administrator on 2016/1/21.
 */
public class MessageException extends Exception implements IErrorThrowable {



    @Override
    public short getErrorCode() {
        return 0;
    }

    @Override
    public String getErrorMsg() {
        return null;
    }
}
