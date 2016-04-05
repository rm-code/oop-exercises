public class Exercise8 {
    public static void main(String[] args) {
        final int JAN = 31, FEB = 28, MAR = 31,
                  APR = 30, MAY = 31, JUN = 30,
                  JUL = 31, AUG = 31, SEP = 30,
                  OCT = 31, NOV = 30, DEC = 31;

        final int DAYS_PER_YEAR      = 365;
        final int DAYS_PER_LEAP_YEAR = 366;
        final int DAYS_PER_WEEK      =   7;

        // Parse the integers from the cmd line args.
        int day   = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year  = Integer.parseInt(args[2]);

        // 1.1.1980 was a tuesday
        // TODO FIX LEAP Years
        // TODO Allow user to go to an earlier date than 1.1.1980

        // Store all days since 1.1.1980.
        int totalDays = 0;

        // Calculate the days per year that have passed since 1980.
        for (int i = 1981; i <= year; i++) {
            if (year % 4 == 0) {
                // Check if the year is divisible by 100 AND NOT divisible by 400.
                if ((year % 100 == 0) && !(year % 400 == 0)) {
                    totalDays += DAYS_PER_YEAR;
                } else {
                    totalDays += DAYS_PER_LEAP_YEAR;
                }
            }
        }

        // Calculate the days to the month in our date.
        // @see Exercise5
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

        // Add the remaining days.
        totalDays += day;

        int weekDay = totalDays % DAYS_PER_WEEK;
        String name = "";

        switch(weekDay) {
            case 0:
                name = "Tuesday";
                break;
            case 1:
                name = "Wednesday";
                break;
            case 2:
                name = "Thursday";
                break;
            case 3:
                name = "Friday";
                break;
            case 4:
                name = "Saturday";
                break;
            case 5:
                name = "Sunday";
                break;
            case 6:
                name = "Monday";
                break;
            default:
                name = "Error";
        }

        System.out.println(day + "." + month + "." + year + " was a " + name);
    }
}
