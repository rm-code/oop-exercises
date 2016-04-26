package Exercise3;

import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class ColorResetHandler implements EventHandler<MouseEvent> {
    Color base = Color.BLACK;

    @Override
    public void handle( MouseEvent event ) {
        if ( event.getButton().equals( MouseButton.PRIMARY )) {
            if ( event.getClickCount() == 2 ) {
                EventTarget target = event.getTarget();
                if ( target instanceof Shape ) {
                    Shape shape = ( Shape ) target; // Cast EventTarget to Shape.
                    shape.setFill( base );
                }
            }
        }
    }
}
