package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Coder implements Observer {
    String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi, " + name + " DevTechFrontier更新了" + arg);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
