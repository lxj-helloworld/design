package command;

/**
 * 具体命令，持有一个接收者角色对象
 */
public class LeftCommand implements Command{
    private TerisMachine terisMachine;

    public LeftCommand(TerisMachine terisMachine) {
        this.terisMachine = terisMachine;
    }

    @Override
    public void execute() {
        terisMachine.toLeft();
    }
}
