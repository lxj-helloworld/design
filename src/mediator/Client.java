package mediator;

public class Client {
    public static void main(String[] args){
        //构造主板对象
        MainBoard mediator = new MainBoard();
        //分别构造各个零部件
        CDDevice cdDevice = new CDDevice(mediator);
        CPU cpu = new CPU(mediator);
        GraphicsCard graphicsCard = new GraphicsCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);
        ///将各个零部件安装到主板
        mediator.setCdDevice(cdDevice);
        mediator.setCpu(cpu);
        mediator.setGraphicsCard(graphicsCard);
        mediator.setSoundCard(soundCard);
        //播放视频
        cdDevice.load();

    }
}
