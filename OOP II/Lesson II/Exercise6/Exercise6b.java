package Exercise6;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Modality;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;

public class Exercise6 extends Application {

    private void createNewWindow( Stage primary, BooleanProperty close ) {
        Stage secondary = new Stage( StageStyle.UTILITY );
        secondary.setAlwaysOnTop( true );
        secondary.initOwner( primary );
        secondary.initModality( Modality.WINDOW_MODAL );

        Button buttonOk = new Button( "Ok" );
        buttonOk.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                close.set( true );
                secondary.close();
            }
        });

        Button buttonCancel = new Button( "Cancel" );
        buttonCancel.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                secondary.close();
            }
        });

        HBox root = new HBox();
        root.getChildren().addAll(
                buttonOk, buttonCancel
        );

        Scene scene = new Scene( root );
        secondary.setScene( scene );
        secondary.showAndWait();
        secondary.centerOnScreen();
    }

    @Override
    public void start( Stage primaryStage ) {
        SimpleBooleanProperty close = new SimpleBooleanProperty( false );

        Button btn = new Button( "Exit" );
        btn.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                createNewWindow( primaryStage, close );
            }
        });

        close.addListener( new ChangeListener<Boolean>() {
            @Override
            public void changed( ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue ) {
                if ( newValue == true ) {
                    Platform.exit();
                }
            }
        } );

        StackPane root = new StackPane();
        root.getChildren().add( btn );

        Scene scene = new Scene( root, 300, 250 );

        primaryStage.setTitle( "Exercise 6" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
