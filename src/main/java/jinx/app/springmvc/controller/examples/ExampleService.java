package jinx.app.springmvc.controller.examples;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/1/15.
 */
@Service
public class ExampleService {

    public String getHello() {
        return " hello word!";
        //  this is spring mvc app.
    }
}
