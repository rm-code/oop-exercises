public class Main {
    public static void main( String[] args ) throws InterruptedException {
        Grid grid = new Grid();

        while (true) {
            for (int i = 0; i < 20; i++) {
                System.out.println();
            }

            grid.step();
            grid.draw();
            Thread.sleep(50);
        }
    }
}
