package lessons.exercise2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise2 extends Application {
    public static void main( String[] args ) {
        launch( args );
    }

    public void start( Stage stage ) {
        Pane root = new Pane();

        Rectangle rectangle = new Rectangle( 450, 150, 50, 50 );
        rectangle.setFill( new Color( 1.0, 0.0, 0.0, 1.0 ) );
        rectangle.setOnMouseClicked( new ClickHandler( rectangle ) );

        Circle circle = new Circle( 300, 300, 50 );
        circle.setFill( new Color( 0.0, 1.0, 0.0, 1.0 ) );
        circle.setOnMouseClicked( new ClickHandler( circle ) );

        Polygon polygon = new Polygon( 150, 150, 120, 180, 180, 180 );
        polygon.setFill( new Color( 0.0, 0.0, 1.0, 1.0 ) );
        polygon.setOnMouseClicked( new ClickHandler( polygon ) );

        root.getChildren().addAll( rectangle, circle, polygon );
        root.setOnScroll( new ScrollHandler() );

        stage.setScene( new Scene( root, 600, 600 ) );
        stage.show();
    }
}
