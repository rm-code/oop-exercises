import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Please enter the temperatures for this week: ");

        Scanner input = new Scanner(System.in);
        int max   = 0; // Stores our maximum temperature.
        int total = 0; // Stores the total sum of temperatures.

        for(int i = 0; i < 7; i++) {
            int val = input.nextInt();

            if (val > max) {
                max = val;
            }

            total += val;
        }

        double average = total / 7.0;

        System.out.println("The highest temperature of the week was " + max + " degrees!");
        System.out.println("The average temperature was " + average + " degrees!");
    }
}
