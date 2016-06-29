package lessons.exercise4;

import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class DragHandler implements EventHandler<MouseEvent> {
    double cx, cy, ox, oy; // Click Coordinates and Original Coordinates

    private void handlePress( MouseEvent event, Node target ) {
        cx = event.getSceneX();
        cy = event.getSceneY();

        ox = target.getTranslateX();
        oy = target.getTranslateY();
    }

    private void handleDrag( MouseEvent event, Node target ) {
        double targetX = event.getSceneX();
        double targetY = event.getSceneY();

        target.setTranslateX( targetX - cx + ox );
        target.setTranslateY( targetY - cy + oy );

        Bounds parent = target.getBoundsInParent();
        Bounds local = target.getBoundsInLocal();

        if ( parent.getMinX() < 0 ) {
            target.setTranslateX( -local.getMinX() );
        }

        if ( parent.getMinY() < 0 ) {
            target.setTranslateY( -local.getMinY() );
        }

        System.out.println( "Local: " + local.getMaxX() + ", " + local.getMaxY() );

        if ( parent.getMaxX() > target.getScene().getWidth() ) {
            target.setTranslateX( target.getScene().getWidth() - local.getMaxX() );
        }

        if ( parent.getMaxY() > target.getScene().getHeight() ) {
            target.setTranslateY( target.getScene().getHeight() - local.getMaxY() );
        }
    }

    public void handle( MouseEvent event ) {
        if ( event.getEventType() == MouseEvent.MOUSE_PRESSED ) {
            handlePress( event, (Node) event.getSource() );
        }

        if ( event.getEventType() == MouseEvent.MOUSE_DRAGGED ) {
            handleDrag( event, (Node) event.getSource() );
        }

        event.consume();
    }
}
