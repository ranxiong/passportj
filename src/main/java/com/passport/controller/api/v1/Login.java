package com.passport.controller.api.v1;

import com.passport.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/12/3.
 */
@Controller
@RequestMapping("/api/v1/login")
public class Login {

    @Resource(name = "loginService")
    private LoginService loginService;

    /**
     * 账号登录 email telephone ......
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String account(@RequestParam String account, @RequestParam String password) {

        // 参数检查


        return "login success......";
    }

    /**
     * 第三方登录
     * 根据第三方参数进行补充
     *
     * @return
     */
    @RequestMapping(value = "/oauth/{platform}", method = RequestMethod.POST)
    public String oauth(@PathVariable String platform) {

        return "hello";
    }

    /**
     * 验证用户回调，返回用户基本信息, uuid和账号信息
     *
     * @return
     */
    @RequestMapping(value = "/token", method = RequestMethod.GET)
    public String token(@RequestParam String token) {

        return "hello";
    }

}
