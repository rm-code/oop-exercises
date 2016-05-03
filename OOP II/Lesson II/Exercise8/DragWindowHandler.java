package Exercise8;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DragWindowHandler implements EventHandler<MouseEvent> {
    Stage stage;

    double stageOriginX, stageOriginY; // The coordinates of the stage registered when the mouse is pressed.
    double absoluteX, absoluteY;       // The absolute screen coordinates of the mouse click.

    public DragWindowHandler( Stage stage ) {
        this.stage = stage;
    }

    @Override
    public void handle( MouseEvent event ) {

        if ( event.isAltDown() ) {
            if ( event.getEventType() == MouseEvent.MOUSE_PRESSED ) {
                stageOriginX = stage.getX();
                stageOriginY = stage.getY();
                absoluteX = event.getScreenX();
                absoluteY = event.getScreenY();
            } else if ( event.getEventType() == MouseEvent.MOUSE_DRAGGED ) {
                // Calculate the translation vector by subtracting the coordinates of the
                // mouse press from the current mouse position. This vector can then be
                // applied to the original stage position to move the stage to the correct
                // position on screen.
                stage.setX( stageOriginX + ( event.getScreenX() - absoluteX ));
                stage.setY( stageOriginY + ( event.getScreenY() - absoluteY ));
            }
        }
    }
}
