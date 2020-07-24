package observer;

public class Client {
    public static void main(String[] args){
        //被观察的角色
        DevTechFronter devTechFronter = new DevTechFronter();
        //观察者
        Coder coder1 = new Coder("Coder1");
        Coder coder2 = new Coder("Coder2");
        Coder coder3 = new Coder("Coder3");
        //将观察者注册到被观察者列表中
        devTechFronter.addObserver(coder1);
        devTechFronter.addObserver(coder2);
        devTechFronter.addObserver(coder3);
        //发布消息
        devTechFronter.postNewContent("this is the new content.");
    }
}
