package Game;

import Gui.ViewManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.show();

        try {

            ViewManager manager = new ViewManager();
            primaryStage = manager.getMainStage();
            primaryStage.setTitle("Vermeer - Die Kunst zu erben! by Raphael Kropp und Andre Mertes");
            primaryStage.show();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
