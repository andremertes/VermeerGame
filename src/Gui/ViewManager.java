package Gui;

import Gui.Elements.MyButton;
import Gui.Elements.MyLabel;
import Gui.Elements.MySubscene;
import Gui.Elements.MyTextarea;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ViewManager {

    private static final int WIDTH = 1024;
    private static final int HEIGHT = 768;
    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;

    private final static int MENU_BUTTONS_START_X = 100;
    private final static int MENU_BUTTONS_START_Y = 150;

    private MySubscene creditsScene;
    private MySubscene playerScene;

    private MySubscene sceneActive;

    List<MyButton> menuButtons;

    public ViewManager() {

        menuButtons = new ArrayList<MyButton>();
        mainPane = new AnchorPane();
        mainScene = new Scene(mainPane, WIDTH, HEIGHT);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
        createSubScenes();
        createButtons();
        createBackground();

        Image cursorImage = new Image("/Gui/Resources/cursorHand_blue.png");
        mainScene.setCursor(new ImageCursor(cursorImage));

    }

    private void showSubScene(MySubscene subscene) {

        if (sceneActive != null) {
            sceneActive.moveSubScene();
        }

        subscene.moveSubScene();
        sceneActive = subscene;

    }

    private void createSubScenes() {

        createCreditsSubscene();
        createPlayerCreatorSubscene();

    }

    private void createCreditsSubscene() {

        creditsScene = new MySubscene();
        mainPane.getChildren().add(creditsScene);

        MyLabel label = new MyLabel("Credits");
        label.setLayoutX(110);
        label.setLayoutY(25);
        creditsScene.getPane().getChildren().add(label);

        MyTextarea people = new MyTextarea("Copyright 2021 by Raphael Kropp, Nils Lamberty und Andre Mertes. Universität Trier. FB IV - Informatikwissenschaften. GdP1b - JProf. Dr. Benjamin Weyers");
        people.setLayoutX(110);
        people.setLayoutY(110);
        creditsScene.getPane().getChildren().add(people);

    }

    private void createPlayerCreatorSubscene() {

        playerScene = new MySubscene();
        mainPane.getChildren().add(playerScene);

        MyLabel label = new MyLabel("Spieler Hinzufügen");
        label.setLayoutX(110);
        label.setLayoutY(25);
        playerScene.getPane().getChildren().add(label);

    }

    public Stage getMainStage() {

        return mainStage;

    }

    private void addMenuButton(MyButton button) {

        button.setLayoutX(MENU_BUTTONS_START_X);
        button.setLayoutY(MENU_BUTTONS_START_Y + menuButtons.size() * 100);
        menuButtons.add(button);
        mainPane.getChildren().add(button);

    }

    private void createButtons() {

        createStartButton();
        createCreditsButton();
        createExitButton();

    }

    private void createStartButton() {

        MyButton startButton = new MyButton("Spiel Starten");
        addMenuButton(startButton);

        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showSubScene(playerScene);
            }
        });

    }

    private void createCreditsButton() {

        MyButton creditsButton = new MyButton("Credits");
        addMenuButton(creditsButton);

        creditsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showSubScene(creditsScene);
            }
        });

    }

    private void createExitButton() {

        MyButton exitButton = new MyButton("Schließen");
        addMenuButton(exitButton);

        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mainStage.close();
            }
        });

    }

    private void createBackground() {

        Image backgroundImage = new Image("/Gui/Resources/background.jpg", 1024, 768, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.ROUND, BackgroundRepeat.ROUND, BackgroundPosition.CENTER, null);
        mainPane.setBackground(new Background(background));

    }

}
