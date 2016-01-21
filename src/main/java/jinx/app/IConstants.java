package jinx.app;

import jinx.app.springmvc.examples.Document;
import jinx.core.layer.container.IContainer;

/**
 * Created by Administrator on 2016/1/15.
 * app系统模块下定义不变的系统变量
 */
public interface IConstants {
    // 启用代码库debug模式，会检查一些配置
    boolean DEBUG = true;
    // 增加接口文档支持
    byte ADD_SUPPORT_DOCUMENT_LEVEL = Document.MASTER_LEVEL;

    String CAPTCHA_CONTAINER = IContainer.SUPPORT_CACHE_REDIS;  // 验证码启用redis作为存储



}
