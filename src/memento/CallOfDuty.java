package memento;

/**
 * 生成者，即需要被保存的对象
 */
public class CallOfDuty {
    private int mCheckPoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    /**
     * 玩游戏
     */
    public void play(){
        System.out.println("玩游戏：" + String.format("第%d关",mCheckPoint));
        mLifeValue = mCheckPoint - 10;
        System.out.println("进度升级");
        mCheckPoint++;
        System.out.println("到达：" + String.format("第%d关",mCheckPoint));
    }

    /**
     * 退出游戏
     */
    public void quit(){
        System.out.println("==============");
        System.out.println("退出游戏前的属性：" + this.toString());
        System.out.println("退出游戏");
        System.out.println("==============");
    }

    /**
     * 创建备忘录
     */
    public Memoto createMemoto(){
        Memoto memoto = new Memoto();
        memoto.mCheckPoint = mCheckPoint;
        memoto.mLifeValue = mLifeValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }

    /**
     * 恢复游戏
     */
    public void restore(Memoto memoto){
        this.mCheckPoint = memoto.mCheckPoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mWeapon = memoto.mWeapon;
        System.out.println("恢复后的游戏属性：" + this.toString());
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckPoint=" + mCheckPoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
