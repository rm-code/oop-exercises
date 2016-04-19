package Exercise3;

import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Shape;

public class CustomEventHandler implements EventHandler<MouseEvent> {
    double objectX;
    double objectY;
    double mouseX;
    double mouseY;

    @Override
    public void handle( MouseEvent event ) {
        if ( event.getEventType() == MouseEvent.MOUSE_PRESSED ) {
            Node node = (Node) event.getTarget();
            objectX = node.getTranslateX();
            objectY = node.getTranslateY();
            mouseX = event.getSceneX();
            mouseY = event.getSceneY();
        } else if ( event.getEventType() == MouseEvent.MOUSE_DRAGGED ) {
            EventTarget target = event.getTarget();
            if ( target instanceof Shape ) {
                Shape shape = ( Shape ) target;
                double tmpX = event.getSceneX() - mouseX + objectX;
                double tmpY = event.getSceneY() - mouseY + objectY;

                // TODO: Prevent shapes from being moved offscreen.
                shape.setTranslateX( tmpX );
                shape.setTranslateY( tmpY );
            }
        }
    }
}
