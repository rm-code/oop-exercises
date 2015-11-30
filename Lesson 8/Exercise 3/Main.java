public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle( "Circle", "red", 5 );
        Rectangle rectangle = new Rectangle( "Rectangle", "blue", 3, 10 );
        Square square = new Square( "Square", "green", 5 );

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
