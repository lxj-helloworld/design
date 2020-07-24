package adapter1;


/**
 * 需要被适配的类，持有旧的方法
 */
public class Banner {
    private String message;
    public Banner(String message){
        this.message = message;
    }
    public void showWithParen(){
        System.out.println("(" + message + ")");
    }
    public void showWithAster(){
        System.out.println("*" + message + "*");
    }
}
