public class Exercise2 {
  public static void main (String[] args) {
    int year = 2004;
    final int LEAP      =   4;    // Years divisible by 4 are leap years
    final int LEAP_EX   = 100;    // Except for those which are also divisible by 100
    final int LEAP_EXEX = 400;    // Unless they are also divisible by 400

    // Check if the year is divisible by 4.
    if (year % LEAP == 0) {
      // Check if the year is divisible by 100 AND NOT divisible by 400.
      if ((year % LEAP_EX == 0) && !(year % LEAP_EXEX == 0)) {
        System.out.println("Year " + year + " is not a leap year!");
      } else {
        System.out.println("Year " + year + " is a leap year!");
      }
    }
  }
}
