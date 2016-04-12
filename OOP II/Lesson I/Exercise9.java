import java.lang.System;

import java.util.Arrays;
import java.util.List;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.charset.Charset;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class Exercise9 extends Application {
    @Override
    public void start( Stage primaryStage ) {
        final String[] LABEL_CONTENT = { "Prename: ", "Surname: ", "Age: ", "Sex: ", "Street: ", "Location: ", "Postcode: " };
        final String[] FIELD_CONTENT = { "Max", "Mustermann", "35", "M", "Beispielstraße 39", "Beispielstadt", "12345 " };

        Label[] labels = new Label[LABEL_CONTENT.length];
        TextField[] fields = new TextField[FIELD_CONTENT.length];

        for ( int i = 0; i < labels.length; i++ ) {
            labels[i] = new Label( LABEL_CONTENT[i] );
            fields[i] = new TextField( FIELD_CONTENT[i] );
        }

        Button buttonSave = new Button( "Save" );
        buttonSave.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                // Create a FileChooser object with a text filter applied.
                FileChooser fileChooser = new FileChooser();
                fileChooser.getExtensionFilters().add( new ExtensionFilter( "Text Files", "*.txt" ));

                // Show the dialog to the user and return the selected file.
                File selectedFile = fileChooser.showSaveDialog( primaryStage );

                // Only do something if the user has selected a (valid) file.
                if ( selectedFile != null ) {
                    String[] lines = new String[fields.length];
                    for ( int i = 0; i < fields.length; i++ ) {
                        lines[i] = fields[i].getText();
                    }
                    List<String> output = Arrays.asList( lines );
                    try {
                        Files.write( selectedFile.toPath(), output, Charset.forName( "UTF-8" ));
                    } catch ( IOException foo ) {
                        // Do something useful here.
                    }
                }
            }
        });
        Button buttonLoad = new Button( "Load" );
        buttonLoad.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                // Create a FileChooser object with a text filter applied.
                FileChooser fileChooser = new FileChooser();
                fileChooser.getExtensionFilters().add( new ExtensionFilter( "Text Files", "*.txt" ));

                // Show the dialog to the user and return the selected file.
                File selectedFile = fileChooser.showOpenDialog( primaryStage );

                // Only do something if the user has selected a (valid) file.
                if ( selectedFile != null ) {
                    try {
                        List<String> output = Files.readAllLines( selectedFile.toPath() );
                        for ( int i = 0; i < output.size(); i++ ) {
                            fields[i].setText( output.get( i ));
                        }
                    } catch ( IOException foo ) {
                        // Do something useful here.
                    }
                }
            }
        });
        Button buttonCancel = new Button( "Clear" );
        buttonCancel.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                for ( int i = 0; i < fields.length; i++ ) {
                    fields[i].clear();
                }
            }
        });

        BorderPane root = new BorderPane();
        VBox vboxL = new VBox();
        VBox vboxR = new VBox();
        HBox hbox = new HBox();

        vboxL.getChildren().addAll( labels );
        vboxL.setPadding( new Insets( 12 ));
        vboxL.setSpacing( 10.0 );

        vboxR.getChildren().addAll( fields );
        vboxR.setPadding( new Insets( 10 ));

        hbox.getChildren().addAll(
            buttonSave, buttonLoad, buttonCancel
        );

        root.setLeft( vboxL );
        // root.setAlignment( vboxL, Pos.TOP_LEFT );
        root.setCenter( vboxR );
        // root.setAlignment( vboxR, Pos.TOP_RIGHT );
        root.setBottom( hbox );
        root.setAlignment( hbox, Pos.TOP_RIGHT );

        Scene scene = new Scene( root, 520, 280 );

        primaryStage.setTitle( "Contact Details" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
