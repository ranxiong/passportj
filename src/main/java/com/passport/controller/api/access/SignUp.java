package com.passport.controller.api.access;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2016/1/15.
 */
@Controller("api_access_sing_up")
@RequestMapping("/api/access/signup")
public class SignUp {

    /**
     * 账号注册提交 POST
     *
     * @param account  残忍的账号
     * @param password 要命的密码
     * @param username  响亮的昵称
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String POST(@RequestParam String account, @RequestParam String password, @RequestParam String username) {

        return "submit success.";
    }

}
