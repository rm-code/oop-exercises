import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.Label;

public class Exercise1h extends Application {
    @Override
    public void start( Stage primaryStage ) {
        Label label = new Label( "Klick #" );
        Text text = new Text();

        Button btn = new Button();
        btn.setText( "Lösung" );
        btn.setOnAction( new EventHandler<ActionEvent>() {
            int clickCounter = 0;

            @Override
            public void handle( ActionEvent event ) {
                clickCounter++;
                text.setText( Integer.toString( clickCounter ));
                primaryStage.sizeToScene();
            }
        });

        // Create the layout.
        HBox root = new HBox();

        // Add the children objects to our layout.
        root.getChildren().add( btn );
        root.getChildren().add( label );
        root.getChildren().add( text );

        Scene scene = new Scene( root );

        primaryStage.setTitle( "Aufgabe 1" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
