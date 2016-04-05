public class Main {
    public static double calculate( int x ) throws IllegalArgumentException {
        double divisor = ( Math.pow(x, 3) - 5 * Math.pow(x, 2) - x + 5 );

        if ( divisor == 0 ) {
            throw new IllegalArgumentException();
        }

        return ( 1 / divisor );
    }

    public static void main( String[] args ) {
        Object[] results = new Object[21]; // Space for values from -10 to 10.
        int index = 0;

        for ( int i = -10; i <= 10; i++ ) {
            Object result = null;
            try {
                result = calculate(i);
            } catch ( IllegalArgumentException e ) {
                result = "Polstelle";
            }
            results[index++] = result;
        }

        for ( int i = 0; i < results.length; i++ ) {
            System.out.println( results[i] );
        }
    }
}
