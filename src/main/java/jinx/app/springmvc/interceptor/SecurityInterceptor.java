package jinx.app.springmvc.interceptor;

import jinx.app.IConstants;
import jinx.app.IProcessConstants;
import jinx.app.request.OAuth;
import jinx.app.request.Signature;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2016/1/21.
 */
public class SecurityInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        //TODO fuck 完全一股php的风格
        Map<String, String[]> parameterMap = request.getParameterMap();
        Map<String, String> params = new HashMap();
        String k, v;
        Iterator<String> iterator = parameterMap.keySet().iterator();
        while (iterator.hasNext()) {
            k = iterator.next();
            String arr[] = parameterMap.get(k);
            v = arr[0];
            params.put(k, v);
        }

        // TODO 1验证签名
        // 验证失败抛出异常
        if (false == Signature.verify(params)) {
            // TODO 抛出验证错误的异常
        }

        // TODO 2 引入用户登录
        OAuth oAuth = new OAuth(params.get(OAuth.HTTP_TOKEN_PARAM_NAME));

        // TODO 3 当前开发环境等级大于等于dev
        if (IConstants.DEBUG_LEVEL >= IProcessConstants.DEV_LEVEL) {
            // TODO 验证 acl 是否需要登录，默认都是需要登录的 不过要排除登录接口本身
        }
        // 以上验证失败都抛出异常

        // TODO 4 记录行为日志，全局日志 但是无法把握此次请求是否正常完成

        //request.getParameterMap();

        return true;
    }

}
