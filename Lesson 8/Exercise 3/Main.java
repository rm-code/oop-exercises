public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle( "Circle", "red", 5 );
        Rectangle rectangle = new Rectangle( "Rectangle", "blue", 3, 10 );
        Square square = new Square( "Square", "green", 5 );

        GeometryObject[] objects = {
            new Circle( "Circle", "red", Math.random() * 5 ),
            new Rectangle( "Rectangle", "blue", Math.random() * 10, Math.random() * 10 ),
            new Square( "Square", "green", Math.random() * 5 ),
        };

        for (int i = 0; i < objects.length; i++) {
            System.out.println( objects[i].toString() );
        }
    }
}
