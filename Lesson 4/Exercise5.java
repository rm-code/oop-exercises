public class Exercise5 {
    public static void main(String[] args) {
        int day, month, week;
        final int DAYS_PER_WEEK = 7;

        // Parse the integers from the cmd line args.
        day   = Integer.parseInt(args[0]);
        month = Integer.parseInt(args[1]);

        int totalDays = 0;

        // Calculate the amount of days we have for each month.
        // Start at month - 1 because we have to ignore the month
        // we are currently in.
        // NOTE: Linters might give you a warning for possible fall-throughs because of the missing breaks.
        switch(month - 1) {
            case 11:
                totalDays += 30;
            case 10:
                totalDays += 31;
            case 9:
                totalDays += 30;
            case 8:
                totalDays += 31;
            case 7:
                totalDays += 31;
            case 6:
                totalDays += 30;
            case 5:
                totalDays += 31;
            case 4:
                totalDays += 30;
            case 3:
                totalDays += 31;
            case 2:
                totalDays += 28;
            case 1:
                totalDays += 31;
            case 0:
                totalDays += 0; // Superfluous but left here for completeness.
        }

        // Add the day we are currently on in the month.
        totalDays += day;

        // Calculate the week we are in.
        week = totalDays / DAYS_PER_WEEK;

        System.out.println("Calendar Week: " + week);
    }
}
