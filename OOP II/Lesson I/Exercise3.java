import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.geometry.Pos;

public class Exercise3 extends Application {
    @Override
    public void start( Stage primaryStage ) {
        Text text = new Text( "Click a button!" );

        Button buttonTop    = new Button( "Top" );
        Button buttonBottom = new Button( "Bottom" );
        Button buttonLeft   = new Button( "Left" );
        Button buttonRight  = new Button( "Right" );

        // Create event handlers for our buttons.
        buttonTop.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                text.setText( buttonTop.getText() );
            }
        });
        buttonBottom.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                text.setText( buttonBottom.getText() );
            }
        });
        buttonLeft.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                text.setText( buttonLeft.getText() );
            }
        });
        buttonRight.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                text.setText( buttonRight.getText() );
            }
        });

        // Create the layout.
        BorderPane root = new BorderPane();

        // Add the children objects to our layout.
        root.setTop( buttonTop );
        root.setAlignment( buttonTop, Pos.CENTER );
        root.setBottom( buttonBottom );
        root.setAlignment( buttonBottom, Pos.CENTER );
        root.setLeft( buttonLeft );
        root.setAlignment( buttonLeft, Pos.CENTER );
        root.setRight( buttonRight );
        root.setAlignment( buttonRight, Pos.CENTER );
        root.setCenter( text );

        Scene scene = new Scene( root, 320, 240 );

        primaryStage.setTitle( "Exercise 3" );
        primaryStage.setScene( scene );
        primaryStage.show();
        primaryStage.sizeToScene();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
