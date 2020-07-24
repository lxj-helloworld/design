package singleton;

/**
 * 饿汉式
 * 应用在创建和使用实例开销不大的场景
 */
public class Singleton1 {
    private Singleton1(){}
    public static Singleton1 singleton1 = new Singleton1();

    public static Singleton1 getInstance(){
        return singleton1;
    }
}
