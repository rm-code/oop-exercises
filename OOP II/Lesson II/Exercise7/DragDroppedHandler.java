package Exercise7;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;

public class DragDroppedHandler implements EventHandler<DragEvent> {
    public void handle( DragEvent event ) {
        Dragboard db = event.getDragboard();
        boolean success = false;
        if ( db.hasImage() ) {
            ImageView view = (ImageView) event.getTarget();
            view.setImage( db.getImage() );
            success = true;
        }

        event.setDropCompleted(success);

        event.consume();
    }
}
