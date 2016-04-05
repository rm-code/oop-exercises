import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final int DAYS_PER_WEEK = 7;
        final int[] DAYS_PER_MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Scanner input = new Scanner(System.in);

        // Parse the integers from the cmd line args.
        System.out.print("Please enter the day: ");
        int days  = input.nextInt();
        System.out.print("Please enter the month: ");
        int month = input.nextInt();

        for (int i = 0; i < (month - 1); i++) {
            days += DAYS_PER_MONTH[i];
        }

        // Calculate the week we are in.
        int week = days / DAYS_PER_WEEK;

        // Make sure we don't start at week 0.
        int rmnt = days % DAYS_PER_WEEK;
        if (rmnt != 0) {
            week++;
        }

        System.out.println("Calendar Week: " + week);
    }
}
