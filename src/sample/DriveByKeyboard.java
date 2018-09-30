package sample;

import static sample.Robot.drivetrain;

public class DriveByKeyboard extends Command {

    private double xVelocity;
    private double yVelocity;

    public DriveByKeyboard(double x, double y)
    {
        this.xVelocity = x;
        this.yVelocity = y;
    }

    @Override
    public void initialize() { }

    @Override
    public void execute()
    {
        drivetrain.drive(xVelocity,yVelocity);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end()
    {
        drivetrain.drive(0,0);
    }
}

