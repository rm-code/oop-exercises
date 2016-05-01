package Exercise7;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercise7 extends Application {
    public FlowPane addFlowPane() {
        FlowPane flow = new FlowPane();
        flow.setPadding( new Insets( -100, 0, 5, 0 ));
        flow.setPrefWrapLength( 1100 );

        ImageView pages[] = new ImageView[4];
        for ( int i = 0; i < 4; i++ ) {
            Image tmp = new Image( getClass().getResource( "images/clothes/equipped/dress" + ( i + 1 ) + ".png" ).toExternalForm() );
            pages[i] = new ImageView();
            pages[i].setImage( tmp );
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

        fp.setOnDragDetected(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                Dragboard db = fp.startDragAndDrop(TransferMode.ANY);

                ClipboardContent content = new ClipboardContent();
                EventTarget target = event.getTarget();
                if ( target instanceof ImageView ) {
                    content.putImage( ((ImageView) target).getImage() );
                }

                db.setContent(content);
                event.consume();
            }
        });
        
        clothesView.setOnDragOver(new EventHandler<DragEvent>() {
            public void handle(DragEvent event) {
                if (event.getGestureSource() != clothesView && event.getDragboard().hasImage()) {
                	/* allow for both copying and moving, whatever user chooses */
                    event.acceptTransferModes(TransferMode.ANY);
                }
                
                event.consume();
            }
        });

        clothesView.setOnDragDropped(new EventHandler<DragEvent>() {
            public void handle(DragEvent event) {
            	System.out.println("Foo");
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasImage()) {
                	clothesView.setImage( db.getImage() );
                    success = true;
                }
                /* let the source know whether the string was successfully
                * transferred and used */
                event.setDropCompleted(success);

                event.consume();
            }
        });

        Scene scene = new Scene( vbox );

        primaryStage.setScene( scene );
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch(args);
    }
}
