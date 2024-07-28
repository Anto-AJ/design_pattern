package trafficcontrol;

public interface Command {
    void execute();
    void undo();
}
