public class Main {
    final public static String[] COLORS = { "Red", "Green", "Blue", "Violet", "Purple", "White", "Black", "Brown" };

    private static void sort(Sortable[] toSort) {
        for (int i = 1; i < toSort.length; i++) {
            for (int j = 0; j < toSort.length - i; j++) {
                if ( toSort[j].isBigger(toSort[j + 1]) > 0 ) {
                    Sortable temp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sortable[] toSort = new Sortable[10];

        System.out.println();
        System.out.println("Unsorted: ");
        for ( int i = 0; i < toSort.length; i++ ) {
            String color = COLORS[(int) (Math.random() * COLORS.length)];
            toSort[i] = new Sock( color, (int) (Math.random() * 10) + 1 );
            System.out.println(toSort[i]);
        }

        sort(toSort);

        System.out.println();
        System.out.println("Sorted: ");
        for ( int i = 0; i < toSort.length; i++ ) {
            System.out.println(toSort[i]);
        }
    }
}
