package sample;

public class TimedRobot {
    public static double IntervalInSeconds = 0.02;

    private Sprite robotSprite;

    public TimedRobot(Sprite robotSprite)
    {
        this.robotSprite = robotSprite;
    }

    public void robotInit() {}

    public void disabledInit() {}

    public void autonomousInit() {}

    public void teleopInit() {}

    public void robotPeriodic() {}

    public void autonmousPeriodic() {}

    public void teleopPeriodic() {}


}
