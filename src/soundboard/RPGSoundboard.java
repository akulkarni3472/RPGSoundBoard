package soundboard;

/**
 * Created by amrutKulkarni on 3/28/17.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RPGSoundboard extends Application {
    private Stage window;
    private Scene appScene;
    private AppScreen appScreen;
    //private

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        appScreen = new AppScreen();
        appScene = new Scene (appScreen, 600, 700);
        window.setTitle("RPG Soundboard");
        window.setScene(appScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
