package command;

/**
 * 具体的命令
 */
public class RightCommand implements Command{
    private TerisMachine terisMachine;

    public RightCommand(TerisMachine terisMachine) {
        this.terisMachine = terisMachine;
    }

    @Override
    public void execute() {
        terisMachine.toRight();
    }
}
