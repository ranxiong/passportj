package jinx.app.springmvc.examples;

/**
 * Created by panyao on 15/12/27.
 * @lib 模块的文档
 * @layer 应用层面的代码文档
 *
 * # 注释就是文档
 */

public class Document {

    // 开发模式下
    public final static byte DEV_LEVEL = 0;
    // 主项目模式下
    public final static byte MASTER_LEVEL = 1;
    // 测试模式下
    public final static byte TEST_LEVEL = 2;
    // QA模式下
    public final static byte QA_LEVEL = 3;
    // 线上
    public final static byte TAG_LEVEL = 4;
    /*--------------以上文档等级向下兼容，
    如配置了MASTER_LEVEL那么开发模式可主项目模式都可以看到文档-------------*/

    public void getDocument(){
        // TODO 首先，得到所有的api，然后得到接口的有效信息，然后慢慢搞
    }
}
