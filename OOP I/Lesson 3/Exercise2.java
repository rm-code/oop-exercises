public class Exercise2 {
    public static void main( String[] args ) {
        int   i;
        float f;

        i = (int) 0.9F * 2;
        System.out.println(i); // > 0 because 0.9F will be set to 0 when cast to int.

        i = 2;
        i = 10 * ( i + 7 / 2 );
        System.out.println(i); // > 10 * ( 2 + 3 ) = 50 because division of two int will return int.

        f = 10 / 3;
        System.out.println(f); // > 3.0 because 10 / 3 will return int 3 and then be cast to float.

        f = 10;
        f = f / 3;
        System.out.println(f); // > 3.33333... because in this case 10 is cast to float before being divided by 3.
    }
}
