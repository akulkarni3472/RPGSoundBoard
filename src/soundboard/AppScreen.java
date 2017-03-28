package soundboard;

import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 * Created by amrutKulkarni on 3/28/17.
 */
public class AppScreen extends BorderPane{
    private AudioPlayer rpgPlayer = new AudioPlayer();
    private Button burp;
    private Button magic1;
    private VBox buttonHolder;

    public AppScreen() {
        burp = new Button("Burp");
        magic1 = new Button("Magic1");
        burp.setOnAction(e -> {
                rpgPlayer.playBurp();
            });
        magic1.setOnAction(e -> {
            rpgPlayer.playMagic1();
        });
        buttonHolder = new VBox(10);
        buttonHolder.getChildren().add(burp);
        buttonHolder.getChildren().add(magic1);
        this.setCenter(burp);
        this.setRight(magic1);
    }
}
