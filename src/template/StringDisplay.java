package template;

/**
 * 算法实现方式2
 */
public class StringDisplay extends AbstractDisplay{
    private String message;
    private int width;
    StringDisplay(String message){
        this.message = message;
        this.width = message.length();
    }
    @Override
    void open() {
        pringLine();
    }

    @Override
    void print() {
        System.out.println("|" + message + "|");
    }

    @Override
    void close() {
    pringLine();
    }

    private void pringLine(){
        System.out.print("+");
        for(int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
