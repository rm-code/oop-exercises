public class Test {
    public static void main(String[] args) {
        System.out.println("Original euclid's algorithm: ");
        Fraction frac1 = new Fraction(1540, 1430);
        Fraction frac2 = new Fraction(390,   154);

        Fraction.mul(frac1, frac2);
        Fraction.div(frac1, frac2);

        Fraction.add(frac1, frac2);
        Fraction.sub(frac1, frac2);
    }
}
