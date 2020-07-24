package singleton;

/**
 * 静态内部类的实现方式
 */
public class Singleton3 {
    private Singleton3(){}
    private static class Singleton3Handler{
        private static Singleton3 singleton3 = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return Singleton3Handler.singleton3;
    }
}
