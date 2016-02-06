public class Exercise1b {
    static void printChain(char toPrint, int start, int length) {
        String output = "";

        // Add whitespace based on starting position.
        for (int i = 0; i < start; i++) {
            output += " ";
        }

        // Add the chars based on the length parameter.
        for (int i = 0; i < length; i++) {
            output += toPrint;
        }

        // Print to the command line.
        System.out.println(output);
    }

    public static void main(String[] args) {
        int height = 10;
        for (int i = 1; i <= height; i++) {
            printChain('#', height - i, i + (i - 1));
        }
    }
}
