package lessons.exercise4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise4 extends Application {
    public static void main( String[] args ) {
        launch( args );
    }

    public void start( Stage stage ) {
        Pane root = new Pane();
        Group group = new Group();

        Rectangle rectangle = new Rectangle( 450, 400, 50, 50 );
        rectangle.setFill( new Color( 1.0, 0.0, 0.0, 1.0 ) );
        rectangle.setOnMouseClicked( new ClickHandler( rectangle ) );

        Circle circle = new Circle( 300, 300, 50 );
        circle.setFill( new Color( 0.0, 1.0, 0.0, 1.0 ) );
        circle.setOnMouseClicked( new ClickHandler( circle ) );

        Polygon polygon = new Polygon( 150, 150, 120, 180, 180, 180 );
        polygon.setFill( new Color( 0.0, 0.0, 1.0, 1.0 ) );
        polygon.setOnMouseClicked( new ClickHandler( polygon ) );

        CheckBox checkBox = new CheckBox( "Move Group" );

        DragHandler dragger = new DragHandler();
        ScrollHandler scroller = new ScrollHandler();

        group.getChildren().addAll( rectangle, circle, polygon );

        checkBox.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
                if ( checkBox.isSelected() ) {
                    group.addEventFilter( MouseEvent.ANY, dragger );
                    group.addEventFilter( ScrollEvent.ANY, scroller );
                } else {
                    group.removeEventFilter( MouseEvent.ANY, dragger );
                    group.removeEventFilter( ScrollEvent.ANY, scroller );
                }
            }
        } );

        rectangle.setOnMousePressed( dragger );
        rectangle.setOnMouseDragged( dragger );
        rectangle.setOnScroll( scroller );
        circle.setOnMousePressed( dragger );
        circle.setOnMouseDragged( dragger );
        circle.setOnScroll( scroller );
        polygon.setOnMousePressed( dragger );
        polygon.setOnMouseDragged( dragger );
        polygon.setOnScroll( scroller );

        root.getChildren().addAll( group, checkBox );

        stage.setScene( new Scene( root, 600, 600 ) );
        stage.show();
    }
}
