package Exercise2;

import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public class BlackKey extends Key {
    public BlackKey( String filename, KeyCode code ) {
        super( filename, code, 50, 70, Color.BLACK );
        this.setStroke( Color.GREY );
    }
}
