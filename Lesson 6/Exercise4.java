public class Exercise4 {
    /**
     * The idea here is that each item i in the triangle is calculated from the
     * items i - 1 and i of the previous line. If there aren't items at that
     * position we simply use zero as a substitute.
    **/
    public static void main(String[] args) {
        final int depth = 10;
        int[] line = {}; // This array is used to create each line of the triangle.

        // Repeat until the desired depth for the triangle is reached.
        for (int i = 0; i < depth; i++) {
             // Create a new array for each line which is one index longer than the previous one.
            int[] tmp = new int[line.length + 1];

            // Iterate over the newly created array and fill it with values.
            for (int j = 0; j < tmp.length; j++) {
                int a = (j - 1 < 0) ? 0 : line[j - 1];
                int b = (j > line.length - 1 ) ? 0 : line[j];
                tmp[j] = (a + b == 0) ? 1 : a + b;
            }

            // Print line to the console.
            for (int j = 0; j < tmp.length; j++) {
                System.out.printf("%4d", tmp[j]);
            }
            System.out.println("");

            // Replace the previous old line with the temporary line and repeat the whole process.
            line = tmp;
        }
    }
}
