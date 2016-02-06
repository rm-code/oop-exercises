import java.util.Scanner;

public class Exercise3 {
    static double power(int base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        } else if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1.0 / power(base, exponent * -1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the base (integer): ");
        int base = input.nextInt();

        System.out.print("Please enter the exponent (integer): ");
        int exponent = input.nextInt();

        double result = power(base, exponent);

        System.out.println("The result of " + base + "^" + exponent + " is " + result + ".");
    }
}
