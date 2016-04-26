package Exercise3;

import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.input.ScrollEvent;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class ColorCycleHandler implements EventHandler<ScrollEvent> {
    @Override
    public void handle( ScrollEvent event ) {
        EventTarget target = event.getTarget();
        if ( target instanceof Shape ) {
            Shape shape = ( Shape ) target; // Cast EventTarget to Shape.
            int r = (int) ( Math.random() * 255 );
            int g = (int) ( Math.random() * 255 );
            int b = (int) ( Math.random() * 255 );
            shape.setFill( Color.rgb( r, g, b ));
        }
    }
}
