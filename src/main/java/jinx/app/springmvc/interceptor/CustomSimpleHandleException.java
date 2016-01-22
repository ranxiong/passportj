package jinx.app.springmvc.interceptor;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/1/21.
 */
public class CustomSimpleHandleException extends SimpleMappingExceptionResolver {

    public void process(){

        // TODO 1 转换异常为响应json

        // TODO 2 记录错误日志

    }

}
