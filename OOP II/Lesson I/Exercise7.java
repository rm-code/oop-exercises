import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Modality;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Exercise7 extends Application {
    private void createNewWindow( Stage primary ) {
        Stage secondary = new Stage( StageStyle.UTILITY );
        secondary.setAlwaysOnTop( true );
        secondary.initOwner( primary );
        secondary.initModality( Modality.WINDOW_MODAL );

        Button buttonOk = new Button( "Ok" );
        buttonOk.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                Platform.exit();
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
        secondary.show();
        secondary.centerOnScreen();
    }

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

        Button buttonOk     = new Button( "Ok" );
        buttonOk.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                System.out.println( labelPrename.getText()  + textFieldPrename.getText() );
                System.out.println( labelSurname.getText()  + textFieldSurname.getText() );
                System.out.println( labelAge.getText()      + textFieldAge.getText() );
                System.out.println( labelSex.getText()      + textFieldSex.getText() );
                System.out.println( labelStreet.getText()   + textFieldStreet.getText() );
                System.out.println( labelLocation.getText() + textFieldLocation.getText() );
                System.out.println( labelPostcode.getText() + textFieldPostcode.getText() );
            }
        });
        Button buttonCancel = new Button( "Cancel" );
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
