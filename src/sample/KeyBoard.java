package sample;

import java.util.ArrayList;

public class KeyBoard {
    private ArrayList<KeyBoardButton> activeButtons;

    public KeyBoard() {
        activeButtons = new ArrayList<KeyBoardButton>();
    }

    void addButton(KeyBoardButton button)
    {
        activeButtons.add(button);
    }

    void updateCommand(ArrayList<String> input)
    {
        if (activeButtons.isEmpty())
            return;
        for (KeyBoardButton oneButton : activeButtons) {
            if (input.contains(oneButton.getName()))
                oneButton.run();
            else
                oneButton.end();
        }
    }
}
