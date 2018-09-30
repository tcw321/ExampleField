package sample;

public class OI {

    public KeyBoard theKeyBoard = new KeyBoard();

    public OI() {
        new KeyBoardButton(theKeyBoard, "LEFT").whenPressed(new DriveByKeyboard(-50, 0));
        new KeyBoardButton(theKeyBoard, "RIGHT").whenPressed(new DriveByKeyboard(50, 0));
        new KeyBoardButton(theKeyBoard, "UP").whenPressed(new DriveByKeyboard(0, -50));
        new KeyBoardButton(theKeyBoard, "DOWN").whenPressed(new DriveByKeyboard(0, 50));
    }
}
