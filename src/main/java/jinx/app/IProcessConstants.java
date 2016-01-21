package jinx.app;

/**
 * Created by Administrator on 2016/1/21.
 * 用于定义开发流程所需要的常量
 */
public interface IProcessConstants {
    String DEV = "dev";
    String MASTER = "master";
    String TEST = "test";
    String QA = "qa";
    String TAG = "tag";

    // 开发模式下
    public final static byte DEV_LEVEL = 0;
    // 主项目模式下
    public final static byte MASTER_LEVEL = 1;
    // 测试模式下
    public final static byte TEST_LEVEL = 2;
    // QA模式下
    public final static byte QA_LEVEL = 3;
    // 线上
    public final static byte TAG_LEVEL = 4;
}
