public class Exercise1 {
  public static void main (String[] args) {
    int m = 1, n = -1;
    boolean a = true, b = false;

    System.out.println(a && !b);              // true and not false == true
    System.out.println(!a || b && a || !b);   // not true or false and true or not false == true
    System.out.println(!a || !b || m < n);    // not true (false) or not false (true) or 1 < -1 (false) == true
    System.out.println(m > n || m == n && m > n);    // 1 > -1 (true) or 1 == -1 (false) and 1 > -1 (true) => true or false (true) and true == true
  }
}
