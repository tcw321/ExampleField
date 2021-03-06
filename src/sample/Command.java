package sample;

public abstract class Command {
    public void initialize() {}

    public void execute() {}

    public abstract boolean isFinished();

    public void end() {}

    public void interrupted() {}

}
