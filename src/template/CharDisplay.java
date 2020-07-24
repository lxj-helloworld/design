package template;

/**
 * 算法实现1
 */
public class CharDisplay extends AbstractDisplay {
    private char aChar;

    CharDisplay(char c){
        this.aChar = c;
    }

    @Override
    void open() {
        System.out.print("<<");
    }

    @Override
    void print() {
        System.out.print(aChar);
    }

    @Override
    void close() {
        System.out.println(">>");
    }
}
