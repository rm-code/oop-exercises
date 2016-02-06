import de.stack.Stack;
import de.stack.EmptyStackException;
import de.stack.FullStackException;
import de.book.Book;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Stack stack = new Stack( 5 );
        Scanner input = new Scanner( System.in );

        while( true ) {
            String token = input.nextLine();
            try {
                if ( token.equals("a") ) {
                    stack.push( new Book("foo", "bar") );
                } else if ( token.equals("d") ) {
                    stack.pop();
                } else if ( token.equals("e") ) {
                    break;
                }
            } catch ( EmptyStackException e ) {
                System.out.println( "There are no books on the stack. Try adding some first!" );
            } catch ( FullStackException e ) {
                System.out.println( "There are too many books on the stack. Try removing some!" );
            }
        }
    }
}
