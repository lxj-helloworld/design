package command;

/**
 * 接收者角色，处理具体逻辑
 * 是整个命令模式中唯一处理具体代码逻辑的地方，
 * 其他的类都是直接或间接的调用到该类的方法
 */
public class TerisMachine {
    /**
     * 真正处理向左操作的逻辑
     */
    public void toLeft(){
        System.out.println("向左");
    }

    /**
     * 真正处理向右操作的逻辑
     */
    public void toRight(){
        System.out.println("向右");
    }

    /**
     * 真正处理快速落下操作的逻辑
     */
    public void fastToBottom(){
        System.out.println("快速落下");
    }

    /**
     * 真正处理改变形状操作的逻辑
     */
    public void transform(){
        System.out.println("改变形状");
    }
}
