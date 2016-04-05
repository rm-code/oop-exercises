/**
 * Calculates the area and volume of a cube.
 */
public class Exercise1 {
    public static void main( String[] args ) {
        int edge = 3;
        int area = 6 * edge * edge;
        int volume = edge * edge * edge;

        System.out.println("A cube with a edge length of " + edge + " has an area of " + area + " and a volume of " + volume + ".");
    }
}
