public class Time {
    private int hrs;
    private int min;

    public Time() {
        this.hrs = 0;
        this.min = 0;
    }

    public Time(int hrs, int min) {
        this(); // Call default constructor to initialise the values.

        // If the parameters are invalid we use the default values.
        if ((hrs < 0 || hrs > 23) || (min < 0 || min > 59)) {
            System.out.printf("Selected time (%02d:%02d) is invalid. Time will use the default values (00:00).", hrs, min);
            System.out.println();
        } else {
            this.hrs = hrs;
            this.min = min;
        }
    }

    public void print() {
        System.out.printf("%02d:%02d", hrs, min);
        System.out.println();
    }
}
