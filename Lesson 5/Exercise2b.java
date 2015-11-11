public class Exercise2b {
    /**
     * Calculates the factorial of a number. If the number is smaller or equal
     * zero the function will return a value of one.
     */
    static double calculateFactorial(int number) {
        double factorial = 1;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
        }

        return factorial;
    }

    static double calculateLottery() {
        return calculateFactorial(49) / (calculateFactorial(49 - 6) * calculateFactorial(6));
    }

    public static void main(String[] args) {
        double result = calculateLottery();

        // Using printf to avoid exponential notation when printing to the cmd line.
        System.out.printf("There are %.0f possible variations for 6 out of 49.\n", result);
    }
}
