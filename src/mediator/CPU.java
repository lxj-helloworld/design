package mediator;

public class CPU extends Colleague{
    String dataVideo,dataSound;//视频数据和音频数据
    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public void setDataVideo(String dataVideo) {
        this.dataVideo = dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    public void setDataSound(String dataSound) {
        this.dataSound = dataSound;
    }
    public void decodeData(String data){
        System.out.println("CPU解码音频和视频数据");
        //通知中介者数据改变
        System.out.println("通知中介者自身状态改变");
        mediator.change(this);
    }
}
