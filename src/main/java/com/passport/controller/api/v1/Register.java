package com.passport.controller.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2015/12/3.
 */
@Controller
@RequestMapping("/api/v1/register")
public class Register {

    /**
     * 账号登录 email telephone ......
     *
     * @return
     */
    @RequestMapping(value = "/account", method = RequestMethod.POST)
    public String account(@RequestParam String accountId, @RequestParam String password) {

        return "hello";
    }

}
