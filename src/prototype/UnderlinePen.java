package prototype;

/**
 * 具体的原型2
 */
public class UnderlinePen implements Product{
    private char ulchar;
    public UnderlinePen(char c){
        this.ulchar = c;
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
