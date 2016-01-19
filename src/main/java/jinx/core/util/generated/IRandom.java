package jinx.core.util.generated;

/**
 * Created by Administrator on 2016/1/15.
 */
public interface IRandom<T> {

    String NUMERIC_CELLS = "0123456789";
    String CHARACTER_CELLS = "abcdefghijklmnopqrstuvwxyz";
    String CHARACTER_UPPER_CELLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * 默认生成的字符串
     *
     * @return
     */
    T generated();

    /**
     * 默认生成的字符长度设置
     *
     * @param size
     * @return
     */
    T generated(byte size);

    /**
     * 自定义字符串
     *
     * @param cells
     * @return
     */
    T generated(String cells);

    /**
     * 自定义字符串输出长度
     *
     * @param cells
     * @param size
     * @return
     */
    T generated(String cells, byte size);

}
