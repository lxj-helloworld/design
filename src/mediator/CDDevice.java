package mediator;

public class CDDevice extends Colleague{
    String dataVideo;//视频数据
    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String getDataVideo() {
        return dataVideo;
    }
    public void load(){
        dataVideo = "从视频流中加载视频数据";
        mediator.change(this);
    }
}
