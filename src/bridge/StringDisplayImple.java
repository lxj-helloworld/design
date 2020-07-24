package bridge;

/**
 * 类的实现层次结构
 * 具体的实现者
 */
public class StringDisplayImple extends DisplayImpl{
    private String string;
    private int width;

    public StringDisplayImple(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }


    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
