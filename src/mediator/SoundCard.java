package mediator;

public class SoundCard extends Colleague{
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放音频
     * @param data
     */
    public void soundPlay(String data){
        System.out.println("播放音频");
    }
}
