package visitor;

/**
 * CEO Visitor
 * 只关注工程师的KPI、经理的KPI以及新产品数量
 */
public class CEOVisitor implements Visitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师 ： " + engineer.name + ", KPI : " + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理 ： " + manager.name + ", KPI : " + manager.kpi + ",新产品数量：" + manager.getProducts());
    }
}
