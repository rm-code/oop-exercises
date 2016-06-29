package lessons.exercise2;

import javafx.event.EventHandler;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class ScrollHandler implements EventHandler<ScrollEvent> {
    @Override
    public void handle( ScrollEvent event ) {
        if ( event.getTarget() instanceof Shape ) {
            Shape target = (Shape) event.getTarget();
            target.setFill( new Color( Math.random(), Math.random(), Math.random(), 1.0 ));
        }
    }
}
