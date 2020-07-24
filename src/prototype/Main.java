package prototype;

/**
 * 测试
 */
public class Main {
    public static void main(String args[]){
        Manager manager = new Manager();
        MessageBox messageBox = new MessageBox('m');
        UnderlinePen underlinePen = new UnderlinePen('u');
        manager.register("m",messageBox);
        manager.register("u",underlinePen);

        Product messageBoxClone = manager.createProduct("m");
        Product underlinePenClone = manager.createProduct("u");
        messageBoxClone.use("this is the messageBoxClone");
        underlinePenClone.use("this is the underlineClone");
    }
}
