package com.passport.controller.open;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/1/15.
 */
@Controller
@RequestMapping("/login")
public class Login {

    /**
     * 授权登录接口，验证才过
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String GET() {

        return "submit success.";
    }

}
