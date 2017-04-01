package soundboard;

import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;

/**
 * Created by amrutKulkarni on 3/28/17.
 */
public class AudioPlayer {

    public AudioPlayer() {

    }

    public void playBurp(){
      Media burp = new Media(Paths.get("RPG Sound Pack/misc/burp.wav").toUri().toString());
      new MediaPlayer(burp).play();
    }
    public void playMagic1(){
        Media magic1 = new Media(Paths.get("RPG Sound Pack/battle/magic1.wav").toUri().toString());
        new MediaPlayer(magic1).play();
    }
}
