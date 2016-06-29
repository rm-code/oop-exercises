import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class Exercise1 extends Application {
    @Override
    public void start( Stage primaryStage ) {
        final Group root = new Group();
        Scene scene = new Scene( root );

        scene.setOnMouseClicked( new EventHandler<MouseEvent>() {
            public void handle( MouseEvent event ) {
                Circle circle = new Circle( event.getSceneX(), event.getSceneY(), 5, Color.BLACK );
                root.getChildren().add( circle );
            }
        });

        primaryStage.setTitle( "Circle Drawing" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
