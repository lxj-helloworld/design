package builder;

/**
 * 指导者，用于使用Builder接口并基于统一的过程生成实例
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 定义的生成对象的统一的过程
     */
    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上到晚上");
        builder.makeTitle("早上好");
        builder.makeString("晚上");
        builder.makeItems("晚上好");
        builder.close();
    }
}
