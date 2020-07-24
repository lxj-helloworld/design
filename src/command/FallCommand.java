package command;

/**
 * 具体的命令
 */
public class FallCommand implements Command{
    private TerisMachine terisMachine;

    public FallCommand(TerisMachine terisMachine) {
        this.terisMachine = terisMachine;
    }

    @Override
    public void execute() {
        terisMachine.fastToBottom();
    }
}
