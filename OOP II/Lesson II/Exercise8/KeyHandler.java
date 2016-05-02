package Exercise8;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class KeyHandler implements EventHandler<KeyEvent> {
    SimpleBooleanProperty altPressed;

    public KeyHandler( SimpleBooleanProperty altPressed ) {
        this.altPressed = altPressed;
    }

    public void handle( KeyEvent keyEvent ) {
        if ( keyEvent.getCode() == KeyCode.ALT ) {
            this.altPressed.set( keyEvent.getEventType() == KeyEvent.KEY_PRESSED );
            keyEvent.consume();
            System.out.println( altPressed.getValue() );
        }
    }
}
