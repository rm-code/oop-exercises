package Exercise8;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DragWindowHandler implements EventHandler<MouseEvent> {
    SimpleBooleanProperty altPressed;
    Stage stage;

    private double xOffset;
    private double yOffset;
    private double mouseX;
    private double mouseY;

    public DragWindowHandler( Stage stage, SimpleBooleanProperty altPressed ) {
        this.stage = stage;
        this.altPressed = altPressed;
    }

    @Override
    public void handle( MouseEvent event ) {
        if ( altPressed.getValue() == true ) {
            if ( event.getEventType() == MouseEvent.MOUSE_PRESSED ) {
                xOffset = stage.getX() - event.getScreenX();
                yOffset = stage.getY() - event.getScreenY();
                mouseX = event.getSceneX();
                mouseY = event.getSceneY();
            } else if ( event.getEventType() == MouseEvent.MOUSE_DRAGGED ) {
                stage.setX( event.getScreenX() - mouseX + xOffset );
                stage.setY( event.getScreenY() - mouseY + yOffset );
            }
        }
    }
}
