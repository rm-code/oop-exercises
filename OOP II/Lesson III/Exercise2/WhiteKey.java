package Exercise2;

import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public class WhiteKey extends Key {
    public WhiteKey( String filename, KeyCode code ) {
        super( filename, code, 50, 100, Color.WHITESMOKE );
        this.setStroke( Color.GREY );
    }
}
