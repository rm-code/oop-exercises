package Exercise8;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;

public class DragOverHandler implements EventHandler<DragEvent> {
    public void handle( DragEvent event ) {
        if ( event.getDragboard().hasImage() ) {
            event.acceptTransferModes( TransferMode.ANY );
        }
        event.consume();
    }
}
