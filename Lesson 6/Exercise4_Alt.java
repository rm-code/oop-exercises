/* Pascal Triangle - Exercise 6/ 4
Alternative Solution to Robert's
*/
public class Exercise4_Alt {

    public static void main(String[] args) {
        int length = 4;
        int[][] p = new int[length][length];
        p[0][0] = 1;
        p[1][0] = 1;
        p[1][1] = 1;
        for (int i = 2; i < p.length; i++) {
            p[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                p[i][j] = p[i - 1][j - 1] + p[i - 1][j];
            }
        }
// Let's create the spaces
        for (int i = 0; i < p.length; i++) {
            for (int j = length; j > i; j--)
                System.out.print("  ");

            for (int j = 0; j < p.length; j++) {
                if (p[i][j] > 0)
                    System.out.printf(" %2d", p[i][j]);
            }
            System.out.println();

        }
    }
}