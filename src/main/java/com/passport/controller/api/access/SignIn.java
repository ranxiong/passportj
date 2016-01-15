package com.passport.controller.api.access;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2016/1/15.
 */
@Controller("api_access_sign_in")
@RequestMapping("/api/access/signin")
public class SignIn {

    /**
     * 账号登录 提交 GET
     *
     * @param account
     * @param password
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String GET(@RequestParam String account, @RequestParam String password) {
        // TODO 这里应该要有验证码，使用，filter实现

        return "";
    }

    /**
     * 账号登录 提交 POST
     *
     * @param account
     * @param password
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String POST(@RequestParam String account, @RequestParam String password) {
        // TODO 这里应该要有验证码，使用，filter实现

        return "";
    }















    /**
     * 第三方登录回调 GET
     *
     * @param platform
     * @return
     */
    @RequestMapping(value = "/{platform}", method = RequestMethod.GET)
    public String oauthGET(@PathVariable String platform) {
        // TODO 这里怎么设计耶？妈的，每个平台返回的参数不一样耶
        return "";
    }

    /**
     * 第三方登录回调 POST
     * TODO 可能没啥用，一般回调都是get吧？！
     *
     * @param platform
     * @return
     */
    @RequestMapping(value = "/{platform}", method = RequestMethod.POST)
    public String oauthPOST(@PathVariable String platform) {
        return "";
    }

}
