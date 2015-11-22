public class Test {
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(3, 5);
        Fraction frac2 = new Fraction(7, 3);

        Fraction.mul(frac1, frac2);
        Fraction.div(frac1, frac2);

        Fraction.add(frac1, frac2);
        Fraction.sub(frac1, frac2);
    }
}
