import java.util.Scanner;

public class Exercise3 {
    static long power(int base, int exponent) {
        // When the exponent is zero we end the recursion by returning one.
        if (exponent == 0) {
            return 1;
        }

        // Recursively call the function with the exponent minus one and
        // multiply the result with our base.
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the base (integer): ");
        int base = input.nextInt();

        System.out.print("Please enter the exponent (integer): ");
        int exponent = input.nextInt();

        long result = power(base, exponent);

        System.out.println("The result of " + base + "^" + exponent + " is " + result + ".");
    }
}
