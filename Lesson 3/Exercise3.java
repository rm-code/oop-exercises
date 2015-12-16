public class Exercise3 {
    public static void main( String[] args )
    {
        int n;

        n = - 3 + 4 * 5 - 6;
        System.out.println(n); // > 20 - 9 = 11 (Multiplication before addition).

        n = 3 + 4 % 5 - 6;
        System.out.println(n); // > 3 + 4 - 6 = 1 (Modulo before addition).

        n = -3 * 5 % - 11 / 2;
        System.out.println(n); // > -4 / 2 = -2 (Java uses negative Modulo).
    }
}
