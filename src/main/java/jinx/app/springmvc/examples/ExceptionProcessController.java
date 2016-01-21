package jinx.app.springmvc.examples;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/1/21.
 */
@Controller
@RequestMapping("/jinx/test/process")
public class ExceptionProcessController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        //model.addAttribute("message", exampleService.getHello());
        return "hello";
    }

}
