package Exercise8;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.DragEvent;

public class DragExitedHandler implements EventHandler<DragEvent> {
    public void handle( DragEvent event ) {
        Node node = (Node) event.getTarget();
        node.setEffect( null );
        event.consume();
    }
}
