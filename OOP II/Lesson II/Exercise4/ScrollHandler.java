package lessons.exercise4;

import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class ScrollHandler implements EventHandler<ScrollEvent> {
    @Override
    public void handle( ScrollEvent event ) {
        if ( event.getSource() instanceof Group ) {
            Parent parent = (Parent) event.getSource();
            ObservableList<Node> children = parent.getChildrenUnmodifiable();
            for ( Node child : children ) {
                Shape target = (Shape) child;
                target.setFill( new Color( Math.random(), Math.random(), Math.random(), 1.0 ) );
            }
        } else if ( event.getSource() instanceof Shape ) {
            Shape target = (Shape) event.getSource();
            target.setFill( new Color( Math.random(), Math.random(), Math.random(), 1.0 ) );
        }

        event.consume();
    }
}
