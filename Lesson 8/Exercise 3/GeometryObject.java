public abstract class GeometryObject {
    private String color;
    private String type;

    public GeometryObject( String type, String color ) {
        this.type = type;
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getCircumference();

    public String getColor() {
        return color;
    }

    public void setColor( String color ) {
        this.color = color;
    }

    public String toString() {
        return "Type: " + type + " Color: " + color;
    }
}
