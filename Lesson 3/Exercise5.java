public class Exercise5 {
  public static void main (String[] args) {
    int x = 3, y = 2, z;

    System.out.println(z = x + 1);        // z = 3 + 1 (z = 4)
    System.out.println(z += x + 1);       // z = z (4) + 3 + 1 (z = 8)
    System.out.println(z += x + y);       // z = z + x + y = 8 + 3 + 2 (z = 13)
    System.out.println(z += x += y);      // z = z + x + y = 13 + 3 + 2 (z = 18, x = 5)
    System.out.println(z += x += y = 1);  // z = z + x + y = 18 + 5 + 1 (z = 24, x = 6, y = 1)
    System.out.println(x *= x = 2);       // x = x * (x = 2) = 6 * (2) => 12
  }
}
