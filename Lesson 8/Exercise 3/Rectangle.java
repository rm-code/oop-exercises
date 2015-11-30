public class Rectangle extends GeometryObject {
    private double width;
    private double height;

    public Rectangle( String type, String color, double width, double height ) {
        super( type, color );
        this.width = width;
        this.height = height;
    }

    public void setHeight( double height ) {
        this.height = height;
    }

    public void setWidth( double width ) {
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

    public double getCircumference() {
        return 2 * ( width + height );
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return super.toString() + " Width: " + width + " Height: " + height;
    }
}
