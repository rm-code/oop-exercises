package Exercise7;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;

public class DragOverHandler implements EventHandler<DragEvent> {
    ImageView target;

    public DragOverHandler( ImageView target ) {
        this.target = target;
    }

    public void handle( DragEvent event ) {
        if ( event.getTarget() == this.target && event.getGestureSource() != this.target && event.getDragboard().hasImage() ) {
            event.acceptTransferModes( TransferMode.ANY );
        }
        event.consume();
    }
}
