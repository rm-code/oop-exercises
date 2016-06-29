package lessons.exercise5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.EventHandler;

public class Exercise5 extends Application {
    public static void main( String[] args ) {
        launch( args );
    }

    public void start( Stage stage ) {
        BorderPane root = new BorderPane();

        EventHandler<MouseEvent> clickHandler = new EventHandler<MouseEvent>() {
            public void handle( MouseEvent event ) {
                if ( event.getButton() == MouseButton.PRIMARY ) {
                    root.getChildren().add( new Circle( event.getX(), event.getY(), 10 ));
                } else {
                    root.getChildren().remove( event.getTarget() );
                }
            }
        };

        root.setOnMouseClicked( clickHandler );

        stage.setScene( new Scene( root ));
        stage.show();
    }
}
