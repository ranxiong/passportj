package com.passport.controller.action.v1.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/12/3.
 */
@Controller("action_v1_login_account")
@RequestMapping("/v1/login/account")
public class Account {

    /**
     * 账号登录 email telephone ......
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String get(ModelMap model) {
        model.addAttribute("message", "Hello World!");
        return "hello";
    }

}
