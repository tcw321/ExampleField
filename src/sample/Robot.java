package sample;

public class Robot extends TimedRobot {
    public static final Drivetrain drivetrain = new Drivetrain();
    public static OI oi;

    @Override
    public void robotInit() {
        oi = new OI();
    }

}
