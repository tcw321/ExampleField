package sample;

public class Robot extends TimedRobot {
    public static final Drivetrain drivetrain = new Drivetrain(IntervalInSeconds);

    public static OI oi;

    public Robot(Sprite robotSprite)
    {
        super(robotSprite);
        drivetrain.addSprite(robotSprite);
    }

    @Override
    public void robotInit() {
        oi = new OI();
    }

}
