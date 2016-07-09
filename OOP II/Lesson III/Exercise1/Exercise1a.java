package Exercise1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise1a extends Application {
    public static void main( String[] args ) {
        launch( args );
    }

    public void start( Stage primaryStage ) {
        Pane root = new Pane();

        Rectangle rectangle = new Rectangle( 50, 50, Color.BLUE );
        rectangle.setX( 50 );
        rectangle.setY( 50 );

        rectangle.setOnMouseEntered( event -> {
            Node node = (Node) event.getTarget();
            node.setEffect( new DropShadow( 2, 5, 5, Color.BLACK ) );
        } );

        rectangle.setOnMouseExited( event -> {
            Node node = (Node) event.getTarget();
            node.setEffect( null );
        } );

        root.getChildren().addAll( rectangle );

        primaryStage.setScene( new Scene( root, 150, 150 ));
        primaryStage.show();
    }
}
