package com.passport.controller.action.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/12/3.
 */
@Controller("action_v1_login")
@RequestMapping("/v1/login")
public class Login {

    /**
     * 账号登录 email telephone ......
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String getLoginTab() {

        return "welcome to login page.";
    }
}
