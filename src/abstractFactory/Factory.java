package abstractFactory;

/**
 * 抽象的工厂
 */
public abstract class Factory {
    public static Factory getInstance(String className){
        Factory factory = null;
        if(className.equals("ListFactory")){
            factory = new ListFactory();
        }
        return factory;
    }

    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);

}
