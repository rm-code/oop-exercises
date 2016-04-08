import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class Exercise5 extends Application {
    @Override
    public void start( Stage primaryStage ) {
        Button btn = new Button( "Exit" );
        btn.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                Platform.exit();
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add( btn );

        Scene scene = new Scene( root, 300, 250 );

        primaryStage.setTitle( "Exercise 5" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
