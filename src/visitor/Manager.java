package visitor;

import java.util.Random;

/**
 * 具体的元素，经理
 */
public class Manager extends Staff{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 一年内做的产品的数量
     * @return
     */
    public int getProducts(){
        return new Random().nextInt(100);
    }
}
