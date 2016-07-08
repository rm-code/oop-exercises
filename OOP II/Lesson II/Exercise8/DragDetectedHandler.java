package Exercise8;

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

            // Dragboard is a drag and drop specific Clipboard.
            // TransferMode determines how the image is moved to the target.
            Dragboard dragboard = node.startDragAndDrop( TransferMode.ANY );

            // ClipboardContent represents the content of the OS clipboard.
            ClipboardContent content = new ClipboardContent();

            ImageView view = (ImageView) target;

            // Save image as clipboard content.
            content.putImage( view.getImage() );

            // Save the clipboard content in the drag specific clipboard (aka dragboard).
            dragboard.setContent( content );
            event.consume();
        }
    }
}
