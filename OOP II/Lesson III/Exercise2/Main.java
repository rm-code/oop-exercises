package Exercise2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    private List<WhiteKey> whiteKeys;
    private List<BlackKey> blackKeys;

    public static void main( String[] args ) {
        launch( args );
    }

    private void loadKeys() {
        String[] wKeyNames = { "c", "d", "e", "f", "g", "a", "h", "c1", "d1", "e1", "f1", "g1", "a1", "h1" };
        KeyCode[] wKeyCodes = { KeyCode.Z, KeyCode.X, KeyCode.C, KeyCode.V, KeyCode.B, KeyCode.N, KeyCode.M, KeyCode.Q, KeyCode.W, KeyCode.E, KeyCode.R, KeyCode.T, KeyCode.Y, KeyCode.U };
        String[] bKeyNames = { "cis", "es", "fis", "gis", "b", "cis1", "es1", "fis1", "gis1", "b1" };
        KeyCode[] bKeyCodes = { KeyCode.A, KeyCode.S, KeyCode.D, KeyCode.F, KeyCode.G, KeyCode.DIGIT1, KeyCode.DIGIT2, KeyCode.DIGIT3, KeyCode.DIGIT4, KeyCode.DIGIT5 };

        whiteKeys = new ArrayList<WhiteKey>();
        blackKeys = new ArrayList<BlackKey>();

        for ( int i = 0; i < wKeyNames.length; i ++ ) {
            whiteKeys.add( new WhiteKey( wKeyNames[i], wKeyCodes[i] ));
        }

        for ( int i = 0; i < bKeyNames.length; i ++ ) {
            blackKeys.add( new BlackKey( bKeyNames[i], bKeyCodes[i] ));
        }
    }

    public void start( Stage primaryStage ) {
        Pane root = new Pane();
        Scene scene = new Scene( root );

        loadKeys();

        HBox whitePane = new HBox();
        HBox blackPane = new HBox();
        StackPane vertical = new StackPane();

        whitePane.getChildren().addAll( whiteKeys );
        whitePane.setSpacing( 10 );

        blackPane.getChildren().addAll( blackKeys );
        blackPane.setSpacing( 15 );
        blackPane.setPickOnBounds( false );

        vertical.getChildren().addAll( whitePane, blackPane );

        root.getChildren().add( vertical );

        root.setOnMouseClicked( event -> {
            for ( Key key: whiteKeys )
                if ( event.getTarget() == key ) {
                    key.playSound();
                    event.consume();
                }
            for ( Key key: blackKeys )
                if ( event.getTarget() == key ) {
                    key.playSound();
                    event.consume();
                }
        });

        scene.setOnKeyPressed( event -> {
            for ( Key key: whiteKeys )
                if ( event.getCode() == key.getCode() ) {
                    key.playSound();
                }
            for ( Key key: blackKeys )
                if ( event.getCode() == key.getCode() ) {
                    key.playSound();
                }
        } );

        primaryStage.setScene( scene );
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
