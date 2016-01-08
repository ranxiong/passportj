package com.passport.controller.api.v1;

/**
 * Created by Administrator on 2015/12/4.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 验证码 改接口返回
 */
@Controller
@RequestMapping("/api/v1/captcha")
public class Captcha {

    @RequestMapping( method = RequestMethod.GET)
    public String get(@RequestParam String account, @RequestParam String password) {

        return "login success......";
    }

    @RequestMapping( method = RequestMethod.POST)
    public String refresh(@RequestParam String account, @RequestParam String password) {

        return "login success......";
    }

}
