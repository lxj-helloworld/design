package prototype;

/**
 * 具体的原型1
 */
public class MessageBox implements Product{
    private char decochar;
    public MessageBox(char s){
        this.decochar = s;
    }

    @Override
    public void use(String s) {
        System.out.println("use. " + s);
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
