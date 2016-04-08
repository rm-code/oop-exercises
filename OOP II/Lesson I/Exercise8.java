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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class Exercise8 extends Application {
    @Override
    public void start( Stage primaryStage ) {
        Label labelPrename  = new Label( "Prename: " );
        Label labelSurname  = new Label( "Surname: " );
        Label labelAge      = new Label( "Age: " );
        Label labelSex      = new Label( "Sex: " );
        Label labelStreet   = new Label( "Street: " );
        Label labelLocation = new Label( "Location: " );
        Label labelPostcode = new Label( "Postcode: " );

        TextField textFieldPrename  = new TextField( "Max" );
        TextField textFieldSurname  = new TextField( "Mustermann" );
        TextField textFieldAge      = new TextField( "35" );
        TextField textFieldSex      = new TextField( "M" );
        TextField textFieldStreet   = new TextField( "Beispielstraße 39" );
        TextField textFieldLocation = new TextField( "Beispielstadt " );
        TextField textFieldPostcode = new TextField( "12345" );

        Button buttonOk     = new Button( "Save" );
        buttonOk.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                // Create a FileChooser object with a text filter applied.
                FileChooser fileChooser = new FileChooser();
                fileChooser.getExtensionFilters().add( new ExtensionFilter( "Text Files", "*.txt" ));

                // Show the dialog to the user and return the selected file.
                File selectedFile = fileChooser.showSaveDialog( primaryStage );

                // Only do something if the user has selected a (valid) file.
                if ( selectedFile != null ) {
                    List<String> output = Arrays.asList(
                                                textFieldPrename.getText(),
                                                textFieldSurname.getText(),
                                                textFieldAge.getText(),
                                                textFieldSex.getText(),
                                                textFieldStreet.getText(),
                                                textFieldLocation.getText(),
                                                textFieldPostcode.getText()
                                        );
                    try {
                        Files.write( selectedFile.toPath(), output, Charset.forName( "UTF-8" ));
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
                textFieldPrename.clear();
                textFieldSurname.clear();
                textFieldAge.clear();
                textFieldSex.clear();
                textFieldStreet.clear();
                textFieldLocation.clear();
                textFieldPostcode.clear();
            }
        });

        BorderPane root = new BorderPane();
        VBox vbox = new VBox();
        HBox hbox = new HBox();

        vbox.getChildren().addAll(
            labelPrename,  textFieldPrename,
            labelSurname,  textFieldSurname,
            labelAge,      textFieldAge,
            labelSex,      textFieldSex,
            labelStreet,   textFieldStreet,
            labelLocation, textFieldLocation,
            labelPostcode, textFieldPostcode
        );

        hbox.getChildren().addAll(
            buttonOk, buttonCancel
        );

        root.setTop( vbox );
        root.setAlignment( vbox, Pos.CENTER );
        root.setBottom( hbox );
        root.setAlignment( hbox, Pos.TOP_RIGHT );

        Scene scene = new Scene( root, 520, 480 );

        primaryStage.setTitle( "Contact Details" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
