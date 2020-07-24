package responsibility;

import iterator.BookShelf;

public class Main {
    public static void main(String[] args){
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        //设置上一级领导者对象
        groupLeader.nextLeader = director;
        director.nextLeader = manager;
        manager.nextLeader = boss;
        //发起报账请求
        groupLeader.handlerRequest(50000);
    }
}
