/** Heron Algorithm **/
public class Exercise6 {
    public static void main( String[] args ) {
        // Start with the value we want the square root of.
        int a = Integer.parseInt( args[0] );

        // Initialise our values.
        double result = a;
        double error;

        // xn = (xn-1 + a/xn-1)/2
        do {
            result = ( result + ( a / result ) ) * 0.5;
            error = -( a - result * result );
        } while ( error > 0.0000000001 );

        System.out.println( "The approximation of the square root of " + a + " found with Heron's algorithm is " + result );
    }
}
