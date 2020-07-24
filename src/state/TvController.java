package state;

/**
 * 电视遥控器
 */
public class TvController implements PowerController{
    private TvState tvState;

    public void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nextChange() {
        tvState.nextChange();
    }

    public void prevChange() {
        tvState.prevChange();
    }

    public void turnUp() {
        tvState.turnUp();
    }

    public void turnDown() {
        tvState.turnDown();
    }
}
