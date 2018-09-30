package sample;

public class Drivetrain extends Subsystem {

    private Sprite robotSprite;
    private double elapsedTime;

    public void addSprite(Sprite robotSprite)
    {
        elapsedTime = 0.02;
        this.robotSprite = robotSprite;
        robotSprite.setVelocity(0,0);
    }

    public void drive(double x, double y)
    {
        robotSprite.setVelocity(0,0);
        robotSprite.addVelocity(x,y);
        robotSprite.update(elapsedTime);
    }
}
