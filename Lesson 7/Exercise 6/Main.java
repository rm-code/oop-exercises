import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        TrafficLight light = new TrafficLight();

        while ( true ) {
            String line = input.nextLine();
            if (line.length() == 0) {
                System.out.println( light.getColor() );
                light.change();
            }
        }
    }
}
