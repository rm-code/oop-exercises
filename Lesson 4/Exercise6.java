/** Heron Algorithm **/
public class Exercise6 {
    public static void main(String[] args) {
        int a;
        int x1, x2;

        // Start with the value we want the square root of.
        a = Integer.parseInt(args[0]);

        // Initialise our values.
        double result = a;

        // xn = (xn-1 + a/xn-1)/2
        double error;

        do {
            result = ( (result) + ( (double) a / (result) ) ) * 0.5;
            error = -(a - Math.pow(result, 2));
        } while ( error > 0.0000000001 );

        System.out.println("The approximation of the square root of " + a + " found with Heron's algorithm is " + result);
    }
}
