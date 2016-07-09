package Exercise2;

import javafx.scene.input.KeyCode;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.io.File;

public class Key extends Rectangle {
    private AudioClip player;
    private KeyCode code;

    public Key( String filename, KeyCode code, double width, double height, Paint fill ) {
        super( width, height, fill );

        this.player = new AudioClip( new File( "res/" + filename + ".mp3" ).toURI().toString() );
        this.code = code;

        this.hoverProperty().addListener(( observable, old, newv ) -> {
            if ( newv == true ) {
                this.setFill( Color.GREY );
            } else {
                this.setFill( fill );
            }
        });
    }

    public void playSound() {
        this.player.play();
    }

    public KeyCode getCode() {
        return code;
    }
}
