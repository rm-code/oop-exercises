public class Circle extends GeometryObject {
    private double radius;

    public Circle( String type, String color, double radius ) {
        super( type, color );
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius( double radius ) {
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\n";
    }
}
