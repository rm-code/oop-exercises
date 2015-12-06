public class Test {
    public static void main(String[] args) {
        System.out.println("Original euclid's algorithm: ");
        Fraction frac1 = new Fraction(1540, 1430);
        Fraction frac2 = new Fraction(390,   154);

        Fraction.mul(frac1, frac2);
        Fraction.div(frac1, frac2);

        Fraction.add(frac1, frac2);
        Fraction.sub(frac1, frac2);

        System.out.println("Modern euclid's algorithm: ");
        Fraction_Alt frac3 = new Fraction_Alt(1540, 1430);
        Fraction_Alt frac4 = new Fraction_Alt(390,   154);

        Fraction_Alt.mul(frac3, frac4);
        Fraction_Alt.div(frac3, frac4);

        Fraction_Alt.add(frac3, frac4);
        Fraction_Alt.sub(frac3, frac4);
    }
}
