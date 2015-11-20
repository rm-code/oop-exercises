public class Rectangle {
    int w, h;

    public Rectangle( int w, int h ) {
        this.w = w;
        this.h = h;

        System.out.println(w + " " + h);
        System.out.println(this.w + " " + this.h);
    }

    public int getArea() {
        return w * h;
    }

    public boolean isSquare() {
        return w == h;
    }
}
