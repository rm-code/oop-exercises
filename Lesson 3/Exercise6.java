public class Exercise6 {
  public static void main (String[] args) {
    int x, z = 10;

    System.out.println(x = z++);    // x = 10, z = 11
    System.out.println(z = ++x);    // z = 11, x = 11
    System.out.println(x += ++z);   // x = x + 12 = 11 + 12 = 23, z = 12
    System.out.println(z += x++);   // z = 12 + 23 = 35, x = 24
    System.out.println(z);
    System.out.println(x);
  }
}
