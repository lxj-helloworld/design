package adapter2;


import adapter1.Banner;

/**
 * 新方法的使用者
 */
public class Main {
    public static void main(String args[]){
        PrintBanner printBanner = new PrintBanner(new Banner("这是对象适配器"));
        printBanner.printWeak();
        printBanner.printStrong();
    }
}
