import java.util.Random;

public class Exercise3 {
    private final Random random;

    public Exercise3( Random random ) {
        this.random = random;
    }

    private boolean isUniqueDraw( int[] results, int draw ) {
        for ( int i = 0; i < results.length; i++ ) {
            if ( results[i] == draw ) {
                return false;
            }
        }
        return true;
    }

    private int drawRandomNumber( int[] results ) {
        int draw;
        do {
            draw = random.nextInt( 49 ) + 1;
        } while ( !isUniqueDraw( results, draw ) );
        return draw;
    }

    private int[] play() {
        int[] results = new int[6]; // Storage for our six results.
        for ( int i = 0; i < results.length; i++ ) {
            results[i] = drawRandomNumber( results );
        }
        return results;
    }

    private void printResults( int[] results ) {
        StringBuilder txt = new StringBuilder( 32 );
        txt.append("LOTTERY NUMBERS:%n");
        for (int i = 0; i < results.length; i++ ) {
            txt.append( results[i] );
            txt.append( i != results.length -1 ? ", " : "%n" );
        }
        System.out.printf( txt.toString() );
    }

    public static void main( String[] args ) {
        Exercise3 lottery = new Exercise3( new Random() );
        int[] results = lottery.play();
        lottery.printResults( results );
    }
}
