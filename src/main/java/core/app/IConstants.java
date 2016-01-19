package core.app;

import core.layer.container.IContainer;

/**
 * Created by Administrator on 2016/1/15.
 * 用于定义不变的系统变量
 */
public interface IConstants {
    boolean DEBUG = true;

    String CAPTCHA_CONTAINER = IContainer.SUPPORT_CACHE_REDIS;  // 验证码启用redis作为存储

}
