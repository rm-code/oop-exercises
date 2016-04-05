public class Watch {
    public static void main(String[] args) {
        // Test default constructor.
        Time time = new Time();
        time.print();
        System.out.println();

        // Test constructor with parameters.
        Time time2 = new Time(22, 5);
        time2.print();
        System.out.println();

        // Test constructor with faulty parameters;
        Time time3 = new Time(25, 5);
        time3.print();
        System.out.println();
    }
}
