package state;

public class Client {
    public static void main(String[] args){
        TvController tvController = new TvController();
        //设置开机状态
        tvController.powerOn();
        tvController.nextChange();//下一个频道
        tvController.turnUp(); //调高音量
        //设置关机状态
        tvController.powerOff();
        //调低音量，此时不会生效
        tvController.turnDown();
    }
}
