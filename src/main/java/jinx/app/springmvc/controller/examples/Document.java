package jinx.app.springmvc.controller.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by panyao on 15/12/27.
 *
 * @lib 模块的文档
 * @layer 应用层面的代码文档
 * <p/>
 * # 注释就是文档
 */
@Controller
@RequestMapping("/jinx/examples/document")
public class Document {
    /*--------------以上文档等级向下兼容，
    如配置了MASTER_LEVEL那么开发模式可主项目模式都可以看到文档-------------*/

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getDocument() {
        return new HashMap<String, Object>() {{
            put("status", 1);
            put("message", "success");
            put("timestamp", System.currentTimeMillis());
            put("data", new ArrayList<String>());
        }};

    }
}
