public class Exercise3 {
    /**
     * BubbleSort
     * Tables are mutable therefore we don't need to return the table at the end
     * of the function.
    **/
    static void sort(int[] toSort) {
        boolean done = false; // This will end the while loop when sorting is done.

        while( !done ) {
            // Set to true. We only continue the iteration when no changes have
            // been made by the end of the nested loop.
            done = true;

            for (int i = 0; i < toSort.length; i++) {
                // Check if we reached the end of the table.
                if (i == toSort.length - 1) {
                    break;
                }

                // Switch i with i + 1 if i is bigger.
                if (toSort[i] > toSort[i + 1]) {
                    int tmp = toSort[i];
                    toSort[i] = toSort[i + 1];
                    toSort[i + 1] = tmp;

                    done = false; // Set to false to continue the sorting.
                }
            }
        }
    }

    /**
     * Dumps the array to the console.
    **/
    static void dumpArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        final int[] toSort = { 10, 5, 4, 9, 7, 6, 8, 2, 1, 3 };

        System.out.println("The following array will be sorted: ");
        dumpArray(toSort);

        sort(toSort);

        System.out.println("Result: ");
        dumpArray(toSort);
    }
}
