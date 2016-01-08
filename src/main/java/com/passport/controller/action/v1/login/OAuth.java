package com.passport.controller.action.v1.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/12/3.
 */
@Controller("action_v1_login_oauth")
@RequestMapping("/v1/login/oauth")
public class OAuth {

    /**
     * 第三方登录,自动注册？！or完善信息？！
     *
     * @return
     */
    @RequestMapping(value = "/{platform}", method = RequestMethod.GET)
    public String oauth(@PathVariable String platform) {

        return "hello";
    }

    /**
     * 第三方登录回调
     *
     * @return
     */
    @RequestMapping(value = "/{platform}/callback", method = RequestMethod.GET)
    public String callback(@PathVariable String platform) {

        return "hello";
    }

}
