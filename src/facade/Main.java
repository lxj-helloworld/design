package facade;

public class Main {
    public static void main(String[] args){
        MobilePhone mobilePhone = new MobilePhone();
        System.out.println("=======拍照=======");
        mobilePhone.takePickture();
        System.out.println("=======视频通话=======");
        mobilePhone.videoChat();
    }
}
