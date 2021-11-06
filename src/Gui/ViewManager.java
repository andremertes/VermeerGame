package Gui;

import Gui.Elements.MyButton;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

    List<MyButton> menuButtons;

    public ViewManager() {

        menuButtons = new ArrayList<MyButton>();
        mainPane = new AnchorPane();
        mainScene = new Scene(mainPane, WIDTH, HEIGHT);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
        createButtons();
        createBackground();
        //createListPane();

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

    }

    private void createCreditsButton() {

        MyButton creditsButton = new MyButton("Credits");
        addMenuButton(creditsButton);

    }

    private void createExitButton() {

        MyButton exitButton = new MyButton("Schließen");
        addMenuButton(exitButton);

    }

    private void createListPane() {

        ImageView pane = new ImageView("/Gui/Resources/panel_beige.png");
        pane.setLayoutX(400);
        pane.setLayoutY(150);
        //pane.setScaleX(2.5);
        //pane.setScaleY(2.5);
        mainPane.getChildren().add(pane);

    }

    private void createBackground() {

        Image backgroundImage = new Image("/Gui/Resources/background.jpg", 1024, 768, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.ROUND, BackgroundRepeat.ROUND, BackgroundPosition.CENTER, null);
        mainPane.setBackground(new Background(background));

    }

}
