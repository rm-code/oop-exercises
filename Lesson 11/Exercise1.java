import java.util.Scanner;

public class Exercise1 {
    private final Scanner input = new Scanner( System.in ); // Use System.in as InputStream.

    /**
     * Reads input line-by-line from the command line and returns it as a String.
     * The String will be returned when an empty line is entered by the user.
     * @return Input read from the command line.
    **/
    public String readInput() {
        StringBuilder text = new StringBuilder( 100 ); // Create a StringBuilder with a capacity of 100.

        while ( true ) {
            String line = input.nextLine();
            if ( line.length() == 0 ) {
                break;
            }
            text.append( line );
            text.append( System.getProperty("line.separator") ); // Append platform-dependent linebreak.
        }

        return text.toString();
    }

    /**
     * Counts the words in a String by splitting it using regex and counting
     * the length of the resulting  array.
     *
     * @param   text The string to count words in.
     * @return       The amount of words in the String.
     *
    **/
    public int countWords( String text ) {
        String[] words = text.split("\\s+"); // Use regex to split the string.
        return words.length;
    }

    public static void main( String[] args ) {
        Exercise1 exercise = new Exercise1();
        String text = exercise.readInput();
        int wordCount = exercise.countWords( text );

        // Formatted output. The %d variable will be replaced by the value in
        // wordCount and %n will insert a platform-dependent linebreak.
        System.out.printf("The text has %d words!%n", wordCount);
    }
}
