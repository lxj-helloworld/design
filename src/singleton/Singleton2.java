package singleton;

/**
 * 懒汉式
 * 创建开销较大，所以延迟实例化，在用到时才会去创建实例
 */
public class Singleton2 {
    private Singleton2(){}
    private static Singleton2 singleton2;
    //双重检查模式，弊端在于由于JVM的指令重排序，使得调用时可能会返回空对象
    public static Singleton2 getInstance(){
        if(singleton2 == null){
            synchronized (Singleton2.class){
                if(singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
