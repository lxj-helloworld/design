package facade;

public class MobilePhone {
    private Phone phone = new PhoneImpl();
    private Camera camera = new SamsungCamera();

    public void dail(){
        phone.dail();
    }

    public void videoChat(){
        camera.open();
        phone.dail();
    }

    public void hangup(){
        phone.hangup();
    }

    public void takePickture(){
        camera.open();
        camera.takePicture();
    }

    public void closeCamera(){
        camera.close();
    }
}
