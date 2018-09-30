package sample;

public class OI {

    public KeyBoard theKeyBoard = new KeyBoard();

    public OI() {
        new KeyBoardButton(theKeyBoard, "LEFT").whenPressed(new DriveByKeyboard());
        new KeyBoardButton(theKeyBoard, "RIGHT").whenPressed(new DriveByKeyboard());
        new KeyBoardButton(theKeyBoard, "UP").whenPressed(new DriveByKeyboard());
        new KeyBoardButton(theKeyBoard, "DOWN").whenPressed(new DriveByKeyboard());
    }
}
