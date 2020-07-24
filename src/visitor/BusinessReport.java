package visitor;

import java.util.ArrayList;
import java.util.List;

public class BusinessReport {
    public List<Staff> mStaffs = new ArrayList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("工程师1"));
        mStaffs.add(new Engineer("工程师2"));
    }

    /**
     * 为访问者展示报表
     */
    public void showReports(Visitor visitor){
        for (Staff staff: mStaffs){
            staff.accept(visitor);
        }
    }
}
