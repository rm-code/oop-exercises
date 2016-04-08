import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class Exercise1d extends Application {
    @Override
    public void start( Stage primaryStage ) {
        Button btn = new Button();
        btn.setText( "Lösung" );
        btn.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                System.out.println( "Hello JavaFX World!" );
            }
        });

        Text text = new Text( "Hello JavaFX World!" );

        // Create the layout.
        HBox root = new HBox();

        // Add the children objects to our layout.
        root.getChildren().add( btn );
        root.getChildren().add( text );

        Scene scene = new Scene( root, 300, 250 );

        primaryStage.setTitle( "Aufgabe 1" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
