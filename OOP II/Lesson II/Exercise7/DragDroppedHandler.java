package Exercise7;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;

public class DragDroppedHandler implements EventHandler<DragEvent> {
    ImageView target;

    public DragDroppedHandler( ImageView target ) {
        this.target = target;
    }

    public void handle( DragEvent event ) {
        Dragboard db = event.getDragboard();
        boolean success = false;
        if ( event.getTarget() == this.target && db.hasImage() ) {
            this.target.setImage( db.getImage() );
            success = true;
        }

        event.setDropCompleted(success);

        event.consume();
    }
}
