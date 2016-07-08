package Exercise7;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.DragEvent;
import javafx.scene.paint.Color;

public class DragEnteredHandler implements EventHandler<DragEvent> {
    @Override
    public void handle( DragEvent event ) {
        Node node = (Node) event.getTarget();

        DropShadow ds = new DropShadow();
        ds.setSpread( 2.0 );
        ds.setColor( Color.rgb( 100, 255, 100, 0.5 ));
        ds.setBlurType( BlurType.GAUSSIAN );
        node.setEffect( ds );
        event.consume();
    }
}
