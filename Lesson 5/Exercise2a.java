public class Exercise2a {
    static double calculateFaculty(int number) {

        // 0! is always 1.
        if (number == 0) {
            return 1;
        }

        double fac = 1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        final int NUMBER = 5;

        // Calculate faculty.
        double result = calculateFaculty(NUMBER);

        System.out.println("The faculty of " + NUMBER + " is " + result);
    }
}
