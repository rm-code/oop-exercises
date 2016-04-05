public class Exercise7 {
    public static void main(String[] args) {
        // Outer loop which gives us the factors from 10 to 20.
        for (int i = 10; i <= 20; i++) {
            System.out.println(i + ":");
            System.out.println("---");

            // Nested loop which gives us the factors from 1 to 10.
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " x " + i + " = " + (j * i) );
            }
            System.out.println("=============" + "\n\r"); // Note the extra linebreak at the end.
        }
    }
}
