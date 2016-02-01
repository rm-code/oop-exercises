/**
 * Counts the amount of "5"s in a given number.
 * E.g.: 123545 -> 2
**/
public class FiveCounter {
    public int countFives( int number ) {
        int count = 0;
        while ( number > 0 ) {
            // Divisible by 10 but not by 5.
            if (( number % 10 != 0 ) && ( number % 5 == 0 )) {
                count++;
            }
            number = number / 10; // Eliminate the last digit by dividing by 10.
        }
        return count;
    }

    public static void main( String[] args ) {
        FiveCounter counter = new FiveCounter();
        int result = counter.countFives( 123545 );

        System.out.printf("The number has %d fives!%n", result);
    }
}
