public class Rectangle {
    int w, h;

    public Rectangle( int w, int h ) {
        this.w = w;
        this.h = h;
    }

    public int getArea() {
        return w * h;
    }

    public boolean isSquare() {
        return w == h;
    }
}
