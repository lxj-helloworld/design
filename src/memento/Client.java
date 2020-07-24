package memento;

/**
 * 使用者
 */
public class Client {
    public static void main(String[] args){
        //构建游戏对象
        CallOfDuty callOfDuty = new CallOfDuty();
        //玩游戏
        callOfDuty.play();
        //游戏存档
        CareTaker careTaker = new CareTaker();
        careTaker.setMemoto(callOfDuty.createMemoto());
        //退出游戏
        callOfDuty.quit();
        //回复游戏
        CallOfDuty callOfDuty1 = new CallOfDuty();
        callOfDuty1.restore(careTaker.getMemoto());
    }
}
