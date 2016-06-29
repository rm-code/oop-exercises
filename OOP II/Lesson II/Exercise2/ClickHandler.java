package lessons.exercise2;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class ClickHandler implements EventHandler<MouseEvent> {
    Color original;

    public ClickHandler( Shape shape ) {
        this.original = (Color) shape.getFill();
    }

    public void handle( MouseEvent event ) {
        if ( event.getClickCount() >= 2 && event.getTarget() instanceof Shape ) {
            Shape target = (Shape) event.getTarget();
            target.setFill( original );
        }
    }
}
