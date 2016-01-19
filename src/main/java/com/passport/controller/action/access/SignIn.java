package com.passport.controller.action.access;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/1/15.
 * 登录，账号（自建账号，邮箱）；第三方账号
 */
@Controller("access_sign_in")
@RequestMapping("/access/signin")
public class SignIn {

    /**
     * 账号登录页面
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String GET() {

//        List<String> features = Arrays.asList("Lambdas", "Default Method",
//                "Stream API", "Date and Time API");
//        for (String feature : features) {
//            System.out.println(feature);
//        }

        List features = Arrays.asList("Lambdas", "Default Method", "Stream API",
                "Date and Time API");
        //features.forEach(n -> System.out.println(n));
        //features.forEach(n->System.out.println(n));

        //features.forEach(n -> System.out.print(n));
        features.forEach(n->System.out.print(n));

        return "weclome to sign in page.";
    }














    /**
     * 第三方账号登录页面
     *
     * @param platform
     * @return
     */
    @RequestMapping(value = "/{platform}", method = RequestMethod.GET)
    public String oauthGET(@PathVariable String platform) {
        // TODO 有没有好的办法验证 platform ?

        return "oauth redirect.";
    }
}
