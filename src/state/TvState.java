package state;

/**
 * 状态
 * 电视状态接口，定义了电视操作
 */
public interface TvState {
    public void nextChange();
    public void prevChange();
    public void turnUp();
    public void turnDown();
}
