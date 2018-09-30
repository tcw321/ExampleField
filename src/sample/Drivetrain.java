package sample;

public class Drivetrain extends Subsystem {

    private Sprite robotSprite;

    public void addSprite(Sprite robotSprite)
    {
        this.robotSprite = robotSprite;
        robotSprite.setVelocity(0,0);
    }

    public void drive(double elapsedTime, double x, double y)
    {
        robotSprite.setVelocity(0,0);
        robotSprite.addVelocity(x,y);
        robotSprite.update(elapsedTime);
    }
}
