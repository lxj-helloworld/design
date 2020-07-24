package observer;

import java.util.Observable;

/**
 * 被观察者
 */
public class DevTechFronter extends Observable {
    public void postNewContent(String content){
        //标志内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }
}
