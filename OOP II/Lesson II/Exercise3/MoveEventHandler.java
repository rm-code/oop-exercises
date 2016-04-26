package Exercise3;

import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Shape;

public class MoveEventHandler implements EventHandler<MouseEvent> {
    double objectX;
    double objectY;
    double mouseX;
    double mouseY;

    private double clamp( double min, double val, double max ) {
        return Math.max( min, Math.min( val, max ));
    }

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

                // Clamp the target coordinates to the scene's dimensions to prevent
                // shapes from being moved offscreen.
                double targetX = clamp( 0, event.getSceneX(), shape.getScene().getWidth() );
                double targetY = clamp( 0, event.getSceneY(), shape.getScene().getHeight() );

                // Calculate the new coordinates for the shape.
                double tmpX = targetX - mouseX + objectX;
                double tmpY = targetY - mouseY + objectY;

                shape.setTranslateX( tmpX );
                shape.setTranslateY( tmpY );
            }
        }
    }
}
