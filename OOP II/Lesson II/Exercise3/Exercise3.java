package Exercise3;

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

public class Exercise3 extends Application {
    @Override
    public void start( Stage primaryStage ) {
        final Group root = new Group();
        Scene scene = new Scene( root, 300, 300 );

        Shape[] shapes = {
            new Circle( scene.getWidth() * 0.5, 60, 40 ),
            new Rectangle( 20, scene.getHeight() - 80, 60, 60 ),
            new Ellipse( scene.getWidth() - 80, scene.getHeight() - 80, 60, 40 )
        };

        MoveEventHandler  moveEventHandler  = new MoveEventHandler();
        ColorCycleHandler colorCycleHandler = new ColorCycleHandler();
        ColorResetHandler colorResetHandler = new ColorResetHandler();

        root.setOnScroll( colorCycleHandler );
        root.setOnMouseClicked( colorResetHandler );
        root.setOnMousePressed( moveEventHandler );
        root.setOnMouseDragged( moveEventHandler );

        root.getChildren().addAll( shapes[0], shapes[1], shapes[2] );
        primaryStage.setTitle( "Circle Drawing" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
