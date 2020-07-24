package command;

/**
 * 具体的命令
 */
public class TransforCommand implements Command{
    private TerisMachine terisMachine;

    public TransforCommand(TerisMachine terisMachine) {
        this.terisMachine = terisMachine;
    }

    @Override
    public void execute() {
        terisMachine.transform();
    }
}
