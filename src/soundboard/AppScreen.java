package soundboard;

//import com.sun.tools.hat.internal.util.Misc;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 * Created by amrutKulkarni on 3/28/17.
 */
public class AppScreen extends BorderPane{
    private AudioPlayer rpgPlayer = new AudioPlayer();
    private Button burp;
    private Button magic1;
    private Button battleTest;
    private Button inventoryTest;
    private Button npcTest;


    private Label rightText;
    private Label leftText;
    private Label topText;
    private Label bottomText;
    private Label centerText;

    private VBox MagicHolder;
    private VBox BattleHolder;
    private VBox InventoryHolder;
    private VBox NPCHolder;
    private VBox MiscHolder;

    public AppScreen() {
        burp = new Button("Burp");
        magic1 = new Button("Magic1");
        battleTest = new Button("Battle Test");
        inventoryTest = new Button("Inventory Test");
        npcTest = new Button("NPC Test");

        rightText = new Label("Magic SFX");
        leftText = new Label("Battle SFX");
        topText = new Label("Inventory SFX");
        centerText = new Label ("NPC SFX");
        bottomText = new Label("Misc SFX");

        burp.setOnAction(e -> {
                rpgPlayer.playBurp();
            });
        magic1.setOnAction(e -> {
            rpgPlayer.playMagic1();
            });

        MagicHolder = new VBox(10);
        BattleHolder = new VBox(10);
        InventoryHolder = new VBox(10);
        NPCHolder = new VBox(10);
        MiscHolder = new VBox(10);

        MiscHolder.getChildren().add(bottomText);
        MiscHolder.getChildren().add(burp);

        MagicHolder.getChildren().add(rightText);
        MagicHolder.getChildren().add(magic1);

        BattleHolder.getChildren().add(leftText);
        BattleHolder.getChildren().add(battleTest);

        InventoryHolder.getChildren().add(topText);
        InventoryHolder.getChildren().add(inventoryTest);

        NPCHolder.getChildren().add(centerText);
        NPCHolder.getChildren().add(npcTest);

        //this.getChildren().addAll(MagicHolder, BattleHolder, InventoryHolder, NPCHolder, MiscHolder);
///*
        this.setRight(MagicHolder);
        this.setLeft(BattleHolder);
        this.setTop(InventoryHolder);
        this.setCenter(NPCHolder);
        this.setBottom(MiscHolder);
//*/
    }
}
