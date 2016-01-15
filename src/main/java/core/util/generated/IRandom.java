package core.util.generated;

/**
 * Created by Administrator on 2016/1/15.
 */
public interface IRandom {
    
    String NUMERIC_CELLS = "0123456789";
    String CHARACTER_CELLS = "abcdefghijklmnopqrstuvwxyz";
    String CHARACTER_UPPER_CELLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public void setRandomValue();

    public void generated();

    public void setResultSize();
}
