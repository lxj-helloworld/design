package visitor;

import java.util.Random;

/**
 * Element 元素抽象类
 */
public abstract class Staff {
    public String name;
    public int kpi;
    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }
    /**
     * 接受Visitor的访问
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
