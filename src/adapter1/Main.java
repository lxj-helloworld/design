package adapter1;

/**
 * 新接口的使用者
 */
public class Main {
    public static void main(String args[]){
        PrintBanner printBanner = new PrintBanner("这是类适配器模式");
        printBanner.printWeak();
        printBanner.printStrong();
    }
}
