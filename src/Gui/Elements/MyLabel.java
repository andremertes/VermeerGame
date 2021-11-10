package Gui.Elements;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.text.Font;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyLabel extends Label {

    final static String FONT_PATH = "src/Gui/Resources/MedievalSharp-Regular.ttf";
    private final static String BACKGROUND_IMAGE = "/Gui/Resources/buttonLong_grey_pressed.png";    // buttonLong_blue_pressed ??

    public MyLabel(String text) {

        setPrefWidth(380);
        setPrefHeight(49);
        setText(text);
        setWrapText(true);
        setMyFont();
        setAlignment(Pos.CENTER);

        BackgroundImage backgroundImage = new BackgroundImage(new Image(BACKGROUND_IMAGE, 380, 49, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);
        setBackground(new Background(backgroundImage));

    }

    private void setMyFont() {

        try {

            setFont(Font.loadFont(new FileInputStream(FONT_PATH), 40));

        } catch (FileNotFoundException e) {

            setFont(Font.font("Verdana", 23));

        }

    }

}
