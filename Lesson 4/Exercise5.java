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
        switch(month - 1) {
            case 0:
                totalDays = 0;
                break;
            case 1:
                totalDays = 31;
                break;
            case 2:
                totalDays = 31 + 28;
                break;
            case 3:
                totalDays = 31 + 28 + 31;
                break;
            case 4:
                totalDays = 31 + 28 + 31 + 30;
                break;
            case 5:
                totalDays = 31 + 28 + 31 + 30 + 31;
                break;
            case 6:
                totalDays = 31 + 28 + 31 + 30 + 31 + 30;
                break;
            case 7:
                totalDays = 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
            case 8:
                totalDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 9:
                totalDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 10:
                totalDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 11:
                totalDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
        }

        // Add the day we are currently on in the month.
        totalDays += day;

        // Calculate the week we are in.
        week = totalDays / DAYS_PER_WEEK;

        System.out.println("Calendar Week: " + week);
    }
}
