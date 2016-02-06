public class RectangleList {
    public static void main( String[] args ) {
        Rectangle[] list = new Rectangle[1000];

        for ( int i = 0; i < list.length; i++ ) {
            list[i] = new Rectangle( (int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1);
        }

        int squares = 0;
        int totalArea = 0;
        for ( int i = 0; i < list.length; i++ ) {
            if ( list[i].isSquare() ) {
                squares++;
            }

            totalArea += list[i].getArea();
        }

        double averageArea = totalArea / list.length;

        System.out.println("Average area: " + averageArea);
        System.out.println("Squares: " + squares);
    }
}
