package trafficcontrol;

public class NoCommand implements Command {
    @Override
    public void execute() {
        // No action
    }

    @Override
    public void undo() {
        // No action
    }
}
