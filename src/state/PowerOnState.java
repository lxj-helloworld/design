package state;

/**
 * 具体的状态1
 */
public class PowerOnState implements TvState{
    @Override
    public void nextChange() {
        System.out.println("上一个频道");
    }

    @Override
    public void prevChange() {
        System.out.println("下一个频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
