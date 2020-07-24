package factory;

/**
 * 测试
 */
public class RunFactory {
    public static void main(String args[]){
        Factory factory = new IDCardFactory();
        Product idCard1 = factory.create("小明1");
        Product idCard2 = factory.create("小明2");
        Product idCard3 = factory.create("小明3");

        idCard1.use();
        idCard2.use();
        idCard3.use();
    }
}
