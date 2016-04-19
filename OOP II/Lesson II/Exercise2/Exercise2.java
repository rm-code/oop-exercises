import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Exercise2 extends Application {
    @Override
    public void start( Stage primaryStage ) {
        final Group root = new Group();
        Scene scene = new Scene( root, 300, 300 );

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle( scene.getWidth() * 0.5, 60, 40 );
        shapes[1] = new Rectangle( 20, scene.getHeight() - 80, 60, 60 );
        shapes[2] = new Ellipse( scene.getWidth() - 80, scene.getHeight() - 80, 60, 40 );

        root.setOnScroll( new EventHandler<ScrollEvent>() {
            @Override
            public void handle( ScrollEvent event ) {
                EventTarget target = event.getTarget();
                if ( target instanceof Shape ) {
                    Shape shape = ( Shape ) target; // Cast EventTarget to Shape.
                    shape.setFill( Color.ALICEBLUE );
                }
            }
        });
        root.setOnMouseClicked( new EventHandler<MouseEvent>() {
            @Override
            public void handle( MouseEvent event ) {
                if ( event.getButton().equals( MouseButton.PRIMARY )) {
                    if ( event.getClickCount() == 2 ) {
                        EventTarget target = event.getTarget();
                        if ( target instanceof Shape ) {
                            Shape shape = ( Shape ) target; // Cast EventTarget to Shape.
                            shape.setFill( Color.BLACK );
                        }
                    }
                }
            }
        });

        root.getChildren().addAll( shapes[0], shapes[1], shapes[2] );
        primaryStage.setTitle( "Circle Drawing" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
