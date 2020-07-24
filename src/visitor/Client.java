package visitor;

/**
 * 测试
 */
public class Client {
    public static void main(String[] args){
        BusinessReport businessReport = new BusinessReport();
        System.out.println("======给CEO看的报表=======");
        businessReport.showReports(new CEOVisitor());
        System.out.println("======给CTO看的报表=======");
        businessReport.showReports(new CTOVisitor());
    }
}
