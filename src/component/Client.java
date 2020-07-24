package component;

/**
 * 测试，使用组合模式的角色
 */
public class Client {
    public static void main(String[] args){
        //构造一个目录对象表示C盘根目录
        Dir diskC = new Folder("C盘");
        //C盘根目录下有一个文件
        diskC.addDir(new File("hello.txt"));
        //C盘根目录下还有三个子目录
        Dir windows = new Folder("Windows");
        diskC.addDir(windows);
        Dir logs = new Folder("Logs");
        diskC.addDir(logs);
        Dir users = new Folder("users");
        diskC.addDir(users);
        ///Windows目录下添加文件
        windows.addDir(new File("windows.txt"));
        //Logs目录下添加文件
        logs.addDir(new File("logs.txt"));
        //Users目录下添加文件
        users.addDir(new File("users.txt"));

        diskC.print();
    }
}
