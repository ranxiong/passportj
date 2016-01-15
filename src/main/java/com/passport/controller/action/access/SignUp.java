package com.passport.controller.action.access;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/1/15.
 */
@Controller("access_sing_up")
@RequestMapping("/access/signup")
public class SignUp {

    /**
     * 账号注册页面
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String GET() {
        return "welcome to sign in page.";
    }

}
