public class Sock implements Sortable {
    private String color;
    private int size;

    public Sock( String color, int size ) {
        this.color = color;
        this.size  = size;
    }

    public int isBigger( Sortable element ) {
        if ( size < element.getSize() ) {
            return -1;
        } else if ( size == element.getSize() ) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        return "Color: " + color + " Size: " + size;
    }
}
