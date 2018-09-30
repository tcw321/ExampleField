package sample;

public class Drivetrain extends Subsystem {

    private Sprite robotSprite;
    private double intervalInSeconds;

    public Drivetrain(double intervalInSeconds)
    {
        this.intervalInSeconds = intervalInSeconds;
    }

    public void addSprite(Sprite robotSprite)
    {
        this.robotSprite = robotSprite;
        robotSprite.setVelocity(0,0);
    }

    public void drive(double x, double y)
    {
        robotSprite.setVelocity(0,0);
        robotSprite.addVelocity(x,y);
        robotSprite.update(intervalInSeconds);
    }
}
