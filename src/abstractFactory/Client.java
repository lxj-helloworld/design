package abstractFactory;

/**
 * 使用抽象工厂将零件组装成产品
 */
public class Client {
    public static void main(String args[]){
        Factory factory = Factory.getInstance("ListFactory");

        Link people = factory.createLink("人名日报","https://www.baidu.com");
        Link sun = factory.createLink("光明日报","https://www.baidu.com");
        Link baidu = factory.createLink("百度","https://www.baidu.com");

        Tray tray1 = factory.createTray("日报");
        tray1.add(people);
        tray1.add(sun);

        Tray tray2 = factory.createTray("百度");
        tray2.add(baidu);

        Page page = factory.createPage("linkpage","哈喽");
        page.add(tray1);
        page.add(tray2);
        page.output();

    }
}
