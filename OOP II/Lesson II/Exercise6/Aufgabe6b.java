package Exercise6;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;


public class Aufgabe6b extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Programm beenden");

        BorderPane root = new BorderPane();
        root.setCenter(btn);

        Scene scene = new Scene(root,400,400);
        primaryStage.setTitle("Aufgabe 6");
        primaryStage.setScene(scene);
        primaryStage.show();

        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                SimpleBooleanProperty schliessen = new SimpleBooleanProperty(false);

                Button ok = new Button("OK");
                Button abbruch = new Button("Abbruch");
                Text text = new Text("Wollen Sie das Programm wirklich beenden?");

                Stage secondstage = new Stage();
                secondstage.setTitle("Information");

                BorderPane root2 = new BorderPane();
                root2.setLeft(ok);
                root2.setTop(text);
                root2.setRight(abbruch);

                BorderPane.setAlignment(ok, Pos.BOTTOM_LEFT);
                BorderPane.setAlignment(text, Pos.TOP_CENTER);
                BorderPane.setAlignment(abbruch, Pos.BOTTOM_RIGHT);

                Scene scene2 = new Scene(root2,350,50);
                secondstage.setScene(scene2);

                secondstage.initModality(Modality.APPLICATION_MODAL);
                secondstage.initOwner(primaryStage);

                secondstage.show();

                schliessen.addListener( new ChangeListener<Object>(){
                    public void changed( ObservableValue<?> observable, Object oldValue, Object newValue ){
                        if ( schliessen.get() == true ) {
                            Platform.exit();
                        }
                    }
                });

                ok.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent event){
                        schliessen.set(true);
                    }
                });

                abbruch.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent event){
                        secondstage.close();
                    }
                });
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
