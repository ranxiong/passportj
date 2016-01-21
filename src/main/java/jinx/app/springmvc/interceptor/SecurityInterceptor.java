package jinx.app.springmvc.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/1/21.
 */
public class SecurityInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        request.getParameterMap();

//        System.out.println("拦截了！" + request.getRequestURI());
//		String path = request.getRequestURI();
//		if(path.indexOf("/login") > -1 || path.indexOf("/register") > -1){
//			return true;
//		}
        HttpSession session = request.getSession();
        //Manager manager = (Manager) session.getAttribute(session.getId());
//        if (null == manager || null == session) {
//            response.sendRedirect(request.getContextPath() + "/manager/toLogin");
//            //new ManagerController().toLogin(new ModelAndView());
//            return false;
//        }else{
//            return true;
//        }
        return true;
    }

}
