package bridge;

/**
 * 类的功能层次结构
 * 抽象化
 */
public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl){
        this.impl = impl;
    }
    public void open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }
    public void close(){
        impl.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }
}
