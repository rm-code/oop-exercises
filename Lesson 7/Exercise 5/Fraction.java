public class Fraction {
    private int dividend;
    private int divisor;
    private int sign = 1;

    public Fraction( int dividend, int divisor ) {
        // Store a negative sign if either the dividend or the divisor are negative.
        int sign = ( dividend < 0 || divisor < 0 ) ? -1 : 1;

        // Store unsigned variants of dividend and divisor.
        this.dividend = Math.abs( dividend );
        this.divisor  = Math.abs( divisor  );

         // Calculate greatest common divisor.
        int gcd = euclid( this.dividend, this.divisor );

        // Shorten the fraction.
        this.dividend = sign * this.dividend / gcd;
        this.divisor  = this.divisor / gcd;

        System.out.println("Created " + this.dividend + "/" + this.divisor);
    }

    private int euclid( int na, int nb ) {
        int a = Math.max( na, nb );
        int b = Math.min( na, nb );
        int u = a - b;
        int v = b;

        while ( u != 0 ) {
            a = Math.max( u, v );
            b = Math.min( u, v );

            u = a - b;
            v = b;
        }

        return v;
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

    public static Fraction add( Fraction a, Fraction b ) {
        return new Fraction( a.dividend * b.divisor + b.dividend * a.divisor, a.divisor * b.divisor );
    }

    public static Fraction sub( Fraction a, Fraction b ) {
        return new Fraction( a.dividend * b.divisor - b.dividend * a.divisor, a.divisor * b.divisor );
    }

    public static Fraction mul( Fraction a, Fraction b ) {
        return new Fraction( a.dividend * b.dividend, a.divisor * b.divisor );
    }

    public static Fraction div( Fraction a, Fraction b ) {
        return new Fraction( a.dividend * b.divisor, a.divisor * b.dividend );
    }
}
