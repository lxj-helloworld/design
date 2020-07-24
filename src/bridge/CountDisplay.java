package bridge;

/**
 * 类的功能层次结构
 * 改善后的抽象化
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    //循环显示次数，在抽象化基础上新增加的功能
    public void multiDisplay(int times){
        open();
        for(int i=0;i<times;i++){
            print();
        }
        close();
    }
}
