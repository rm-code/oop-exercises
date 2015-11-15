public class Exercise4 {
    /**
     * The idea here is that each item i in the triangle is calculated from the
     * items i - 1 and i of the previous line. If there aren't items at that
     * position we simply use zero as a substitute.
    **/
    public static void main(String[] args) {
        final int depth = 15;
        int[] line = {}; // This array is used to create each line of the triangle.

        // Repeat until the desired depth for the triangle is reached.
        for (int i = 1; i <= depth; i++) {
             // Create a new array for each line which is one index longer than the previous one.
            int[] tmp = new int[line.length + 1];

            // Iterate over the newly created array and fill it with values.
            for (int j = 0; j < tmp.length; j++) {
                int a = (j - 1 < 0) ? 0 : line[j - 1];
                int b = (j > line.length - 1 ) ? 0 : line[j];
                tmp[j] = (a + b == 0) ? 1 : a + b;
            }

            // This adds whitespace in front of each line to create the triangle.
            // NOTE: This was not part of the actual exercise.
            for (int j = 1; j <= depth - i; j++) {
                System.out.print("   ");
            }

            // Print line to the console.
            for (int j = 0; j < tmp.length; j++) {
                // Match the whitespace based on the value of the element.
                // NOTE: This whole block could be replaced easily with printf:
                // System.out.printf("%6d", tmp[j]);
                if (tmp[j] < 10) {
                    System.out.print("     " + tmp[j]);
                } else if(tmp[j] < 100) {
                    System.out.print("    " + tmp[j]);
                } else if(tmp[j] < 1000) {
                    System.out.print("   " + tmp[j]);
                } else {
                    System.out.print("  " + tmp[j]);
                }
            }
            System.out.println("");

            // Replace the previous old line with the temporary line and repeat the whole process.
            line = tmp;
        }
    }
}
