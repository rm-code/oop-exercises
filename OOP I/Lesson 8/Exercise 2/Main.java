import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack(10);

        System.out.println("Add (a) or Delete (d) objects or Exit (e): ");

        while(true) {
            String token = input.nextLine();
            if ( token.equals("a") && !stack.isFull() ) {
                stack.push(new Book("foo", "bar")); // Add book objects to the stack.
            } else if ( token.equals("d") && !stack.isEmpty() ) {
                stack.pop();
            } else if ( token.equals("e") ) {
                break;
            }

            System.out.println("Size:  " + stack.getSize());
            System.out.println("Empty: " + stack.isEmpty());
            System.out.println("Full:  " + stack.isFull());
        }

        // Dump the stack's contents to the console.
        while ( !stack.isEmpty() ) {
            System.out.println(stack.pop());
        }
    }
}
