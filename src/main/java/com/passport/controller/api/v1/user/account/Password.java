package com.passport.controller.api.v1.user.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/12/3.
 */
@Controller
@RequestMapping("/api/v1/user/account/password")
public class Password {

    /**
     * 修改密码需要展示的json数据
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String passwordInfo() {

        return "hello";
    }

    /**
     * 修改密码需要展示的json数据
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String updatePassword() {

        return "hello";
    }
}
