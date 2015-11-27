public class Exercise3_Alt {
    /**
     * BubbleSort
     * Tables are mutable therefore we don't need to return the table at the end
     * of the function.
    **/

    public static void lessEfficientBubbleSort(int[] toSort) {
        int temp;
        for (int i = 1; i < toSort.length; i++) {
            for (int j = 0; j < toSort.length - i; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    temp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = temp;
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

        lessEfficientBubbleSort(toSort);

        System.out.println("Result: ");
        dumpArray(toSort);
    }
}
