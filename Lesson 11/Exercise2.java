import java.util.Scanner;

public class Exercise2 {
    private final Scanner input = new Scanner( System.in );

    /**
     * Reads a single line of Text from from the command line.
     * @return Input read from the command line.
    **/
    public String readInput() {
        return input.nextLine();
    }

    /**
     * Extracts only the word characters of a String, concanates them and
     * converts all chars to lower case.
     * @param  original The String to extract the Characters from.
     * @return          All characters of the original string converted to
     *                  lower case and concatenated into a String.
    **/
    public String extractCharacters( String original ) {
        String[] result = original.split("[^\\w]+");
        StringBuilder characters = new StringBuilder();
        for ( int i = 0; i < result.length; i++ ) {
            characters.append( result[i] );
        }
        return characters.toString().toLowerCase();
    }

    /**
     * Compares a String to the reversed version of itself.
     * @param   toCheck The String to check.
     * @return          Wether or not the string is a palindrome.
    **/
    public boolean isPalindrome( String toCheck ) {
        String reversed = new StringBuilder( toCheck ).reverse().toString();
        return toCheck.equals( reversed );
    }

    public static void main( String[] args ) {
        Exercise2 exercise = new Exercise2();
        String input = exercise.readInput();
        String raw = exercise.extractCharacters( input );
        boolean result = exercise.isPalindrome( raw );

        if ( result ) {
            System.out.printf( "\"%s\" is a Palindrome!%n", input );
        } else {
            System.out.printf( "\"%s\" is not a Palindrome!%n", input );
        }
    }
}
