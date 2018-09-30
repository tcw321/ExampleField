package sample;

public class KeyBoardButton {
    private String name;
    private Command command;

    public KeyBoardButton(KeyBoard keyBoard, String name)
    {
        this.name = name;
        keyBoard.addButton(this);
    }

    public String getName()
    {
        return name;
    }

    public void run()
    {
        command.execute();
    }

    public void end()
    {
        command.end();
    }

    public void whenPressed(Command command)
    {
        this.command = command;
    }
}
