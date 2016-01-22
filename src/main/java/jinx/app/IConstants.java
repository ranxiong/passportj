package jinx.app;

/**
 * Created by Administrator on 2016/1/15.
 * app系统模块下定义不变的系统变量
 */
public interface IConstants {

    // 启用代码库debug模式，会检查一些配置
    byte DEBUG_LEVEL = IProcessConstants.MASTER_LEVEL;
    // 增加接口文档支持
    byte ADD_SUPPORT_DOCUMENT_LEVEL = IProcessConstants.MASTER_LEVEL;

}
