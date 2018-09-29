package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Iterator;

public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage theStage)
    {
        theStage.setTitle( "Robot Competition" );

        Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );

        Canvas canvas = new Canvas( 512, 512 );
        root.getChildren().add( canvas );

        ArrayList<String> input = new ArrayList<String>();

        theScene.setOnKeyPressed(
                new EventHandler<KeyEvent>()
                {
                    public void handle(KeyEvent e)
                    {
                        String code = e.getCode().toString();
                        if ( !input.contains(code) )
                            input.add( code );
                    }
                });

        theScene.setOnKeyReleased(
                new EventHandler<KeyEvent>()
                {
                    public void handle(KeyEvent e)
                    {
                        String code = e.getCode().toString();
                        input.remove( code );
                    }
                });

        GraphicsContext gc = canvas.getGraphicsContext2D();

        Font theFont = Font.font( "Helvetica", FontWeight.BOLD, 24 );
        gc.setFont( theFont );
        gc.setFill( Color.GREEN );
        gc.setStroke( Color.BLACK );
        gc.setLineWidth(1);

        Sprite robotSprite = new Sprite();
        robotSprite.setPosition(200, 0);

        LongValue lastNanoTime = new LongValue( System.nanoTime() );

        IntValue score = new IntValue(0);

        KeyBoard theKeyBoard = new KeyBoard();

        new KeyBoardButton(theKeyBoard, "LEFT");
        new KeyBoardButton(theKeyBoard, "RIGHT");
        new KeyBoardButton(theKeyBoard, "UP");
        new KeyBoardButton(theKeyBoard, "DOWN");

        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                // calculate time since last update.
                double elapsedTime = (currentNanoTime - lastNanoTime.value) / 1000000000.0;
                lastNanoTime.value = currentNanoTime;

                // game logic

                theKeyBoard.updateCommand(input);

                robotSprite.setVelocity(0,0);
                if (input.contains("LEFT"))
                    robotSprite.addVelocity(-50,0);
                if (input.contains("RIGHT"))
                    robotSprite.addVelocity(50,0);
                if (input.contains("UP"))
                    robotSprite.addVelocity(0,-50);
                if (input.contains("DOWN"))
                    robotSprite.addVelocity(0,50);

                robotSprite.update(elapsedTime);

                // render

                gc.clearRect(0, 0, 512,512);
                robotSprite.render( gc );

                String pointsText = "Robotics Simulation";
                gc.fillText( pointsText, 360, 36 );
                gc.strokeText( pointsText, 360, 36 );
            }
        }.start();

        theStage.show();
    }
}