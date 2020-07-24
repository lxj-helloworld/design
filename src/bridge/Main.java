package bridge;

/**
 * 测试
 */
public class Main {
    public static void main(String[] args){
        Display d1 = new Display(new StringDisplayImple("hello. China."));
        Display d2 = new CountDisplay(new StringDisplayImple("hello. World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImple("hello. Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(3);
    }
}
