package Exercise8;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercise8 extends Application {
    public FlowPane addFlowPane() {
        FlowPane flow = new FlowPane();
        flow.setPrefWrapLength( 300 );

        ImageView pages[] = new ImageView[4];
        for ( int i = 0; i < 4; i++ ) {
            Image tmp = new Image( getClass().getResource( "images/clothes/equipped/dress" + ( i + 1 ) + ".png" ).toExternalForm() );
            pages[i] = new ImageView();
            pages[i].setImage( tmp );
            pages[i].setFitWidth( tmp.getWidth() * 0.5 );
            pages[i].setFitHeight( tmp.getHeight() * 0.5 );
            flow.getChildren().add( pages[i] );
        }

        return flow;
    }

    @Override
    public void start( Stage primaryStage ) {
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        StackPane sp = new StackPane();
        FlowPane fp = addFlowPane();

        Image flowers = new Image( getClass().getResource( "images/ui/flowers.jpg" ).toExternalForm());
        ImageView headerView = new ImageView();
        headerView .setImage( flowers );

        Image body = new Image( getClass().getResource( "images/body.png" ).toExternalForm());
        ImageView bodyView = new ImageView();
        bodyView.setImage( body );

        ImageView clothesView = new ImageView();
        clothesView.setImage( body );

        hbox.getChildren().add( fp );
        hbox.getChildren().add( sp );
        vbox.getChildren().add( headerView );
        vbox.getChildren().add( hbox );

        sp.getChildren().addAll( bodyView, clothesView );

        fp.setOnDragDetected( new DragDetectedHandler() );
        clothesView.setOnDragOver( new DragOverHandler() );
        clothesView.setOnDragDropped( new DragDroppedHandler() );
        clothesView.setOnDragEntered( new DragEnteredHandler());
        clothesView.setOnDragExited( new DragExitedHandler() );

        Scene scene = new Scene( vbox );

        EventHandler<MouseEvent> windowEventHandler = new DragWindowHandler( primaryStage );

        scene.setOnMousePressed( windowEventHandler );
        scene.setOnMouseDragged( windowEventHandler );

        primaryStage.setScene( scene );
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch(args);
    }
}
