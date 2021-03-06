package visitor;

/**
 * CTO访问者
 * 只关注工程师的代码行数和经理的产品数量
 */
public class CTOVisitor implements Visitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师 ： " + engineer.name + ", 代码行数 : " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理 ： " + manager.name + ", 产品数量 : " + manager.getProducts());
    }
}
