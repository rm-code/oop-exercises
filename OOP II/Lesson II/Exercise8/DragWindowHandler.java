package Exercise8;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DragWindowHandler implements EventHandler<MouseEvent> {
    Stage stage;

    double xOffset, yOffset, mouseX, mouseY;

    public DragWindowHandler( Stage stage ) {
        this.stage = stage;
    }

    @Override
    public void handle( MouseEvent event ) {

        if ( event.isAltDown() ) {
            if ( event.getEventType() == MouseEvent.MOUSE_PRESSED ) {
                xOffset = stage.getX();
                yOffset = stage.getY();
                mouseX = event.getScreenX();
                mouseY = event.getScreenY();
            } else if ( event.getEventType() == MouseEvent.MOUSE_DRAGGED ) {
                stage.setX( xOffset + ( event.getScreenX() - mouseX ));
                stage.setY( yOffset + ( event.getScreenY() - mouseY ));
            }
        }
    }
}
