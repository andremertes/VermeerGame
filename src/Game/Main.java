package Game;

import Gui.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        try {

            ViewManager manager = new ViewManager();
            primaryStage = manager.getMainStage();
            primaryStage.setTitle("Vermeer - Die Kunst zu erben! by Raphael Kropp, Nils Lamberty und Andre Mertes");
            primaryStage.show();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
