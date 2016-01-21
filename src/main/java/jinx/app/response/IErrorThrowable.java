package jinx.app.response;

/**
 * Created by Administrator on 2016/1/15.
 */
public interface IErrorThrowable{

    short DEFAULT_ERROR_CODE = 5000;
    String DEFAULT_ERROR_MSG = "error";

    public short getErrorCode();

    public String getErrorMsg();
}
