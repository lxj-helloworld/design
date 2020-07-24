package command;

/**
 * 请求者
 */
public class Buttons {
    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private FallCommand fallCommand;
    private TransforCommand transforCommand;

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setTransforCommand(TransforCommand transforCommand) {
        this.transforCommand = transforCommand;
    }

    public void toLeft(){
        leftCommand.execute();
    }

    public void toRight(){
        rightCommand.execute();
    }

    public void fall(){
        fallCommand.execute();
    }

    public void transform(){
        transforCommand.execute();
    }
}
