package visitor;

import java.util.Random;

/**
 * 具体的元素，工程师
 */
public class Engineer extends Staff{
    public Engineer(String name) {
        super(name);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * 工程师这一年的代码量
     * @return
     */
    public int getCodeLines(){
        return new Random().nextInt(10000);
    }
}
