package com.passport.controller.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/12/3.
 */
@Controller
@RequestMapping("/api/v1/user")
public class User {

    /**
     * 获取用户信息
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String info() {

        return "hello";
    }

    /**
     * 完善用户信息
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String update() {

        return "hello";
    }
}
