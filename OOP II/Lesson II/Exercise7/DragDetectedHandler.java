package Exercise7;

import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;

public class DragDetectedHandler implements EventHandler<MouseEvent> {
    public void handle( MouseEvent event ) {
        EventTarget target = event.getTarget();
        if ( target instanceof ImageView ) {
            Node node = (Node) target;
            Dragboard db = node.startDragAndDrop( TransferMode.ANY );

            ClipboardContent content = new ClipboardContent();

            ImageView view = (ImageView) target;
            content.putImage( view.getImage() );
            db.setContent( content );
            event.consume();
        }
    }
}
