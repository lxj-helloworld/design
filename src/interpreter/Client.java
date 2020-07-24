package interpreter;

public class Client {
    public static void main(String[] args){
        Calculator c = new Calculator("1 + 2 + 3 + 4");
        System.out.println(c.calculate());
    }
}
