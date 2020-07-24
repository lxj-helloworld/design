package mediator;

public class MainBoard extends Mediator{
    private CDDevice cdDevice;//光驱设备
    private CPU cpu;//CPU
    private SoundCard soundCard;//声卡设备
    private GraphicsCard graphicsCard;//显示设备


    @Override
    void change(Colleague c) {
        if(c == cdDevice){
            handlerCD((CDDevice)c);
        }else if(c == cpu){
            handleCPU((CPU)c);
        }
    }

    private void handlerCD(CDDevice cdDevice){
        cpu.decodeData(cdDevice.getDataVideo());
    }

    private void handleCPU(CPU cpu){
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
