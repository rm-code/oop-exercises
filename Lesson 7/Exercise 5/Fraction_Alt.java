public class Fraction_Alt {
    private int dividend;
    private int divisor;
    private int sign = 1;

    public Fraction_Alt( int dividend, int divisor ) {
        // Store a negative sign if either the dividend or the divisor are negative.
        int sign = ( dividend < 0 || divisor < 0 ) ? -1 : 1;

        // Store unsigned variants of dividend and divisor.
        this.dividend = Math.abs( dividend );
        this.divisor  = Math.abs( divisor  );

         // Calculate greatest common divisor.
         int gcd = euclid( Math.max( this.dividend, this.divisor ), Math.min( this.dividend, this.divisor ) );

        // Shorten the fraction.
        this.dividend = sign * this.dividend / gcd;
        this.divisor  = this.divisor / gcd;

        System.out.println("Created " + this.dividend + "/" + this.divisor);
    }

    private int euclid( int a, int b ) {
        while ( a % b != 0 ) {
            int r = a % b;
            a = b;
            b = r;
        }

        return b;
    }

    public int getDividend() {
        return this.dividend;
    }

    public int getDivisor() {
        return this.divisor;
    }

    public String toString() {
        return this.dividend + "/" + this.divisor;
    }

    public static Fraction_Alt add( Fraction_Alt a, Fraction_Alt b ) {
        return new Fraction_Alt( a.dividend * b.divisor + b.dividend * a.divisor, a.divisor * b.divisor );
    }

    public static Fraction_Alt sub( Fraction_Alt a, Fraction_Alt b ) {
        return new Fraction_Alt( a.dividend * b.divisor - b.dividend * a.divisor, a.divisor * b.divisor );
    }

    public static Fraction_Alt mul( Fraction_Alt a, Fraction_Alt b ) {
        return new Fraction_Alt( a.dividend * b.dividend, a.divisor * b.divisor );
    }

    public static Fraction_Alt div( Fraction_Alt a, Fraction_Alt b ) {
        return new Fraction_Alt( a.dividend * b.divisor, a.divisor * b.dividend );
    }
}
