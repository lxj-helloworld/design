package command;

public class Client {
    public static void main(String[] args){
        //构造俄罗斯方块游戏
        TerisMachine terisMachine = new TerisMachine();
        //构造四种命令
        LeftCommand leftCommand = new LeftCommand(terisMachine);
        RightCommand rightCommand = new RightCommand(terisMachine);
        FallCommand fallCommand = new FallCommand(terisMachine);
        TransforCommand transforCommand = new TransforCommand(terisMachine);
        //按钮可以执行不同的命令
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFallCommand(fallCommand);
        buttons.setTransforCommand(transforCommand);
        //具体按下哪个按钮玩家说了算
        buttons.toLeft();
        buttons.toRight();
        buttons.fall();
        buttons.transform();
    }
}
