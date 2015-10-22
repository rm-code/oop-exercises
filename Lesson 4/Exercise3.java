public class Exercise3 {
  public static void main (String[] args) {
    int a = 200, b = 300, c = 640;

    int sortedA = 0, sortedB = 0, sortedC = 0;

    // if a > b and a > c then we just sort b and c
    if ((a > b) && (a > c)) { // a must be the biggest number
      sortedA = a;
      if (b > c) {
        sortedB = b;
        sortedC = c;
      } else {
        sortedB = c;
        sortedC = b;
      }
    } else if ((a < b) && (a < c)) { // a must be the smallest number
      sortedC = a;
      if (b > c) {
        sortedA = b;
        sortedB = c;
      } else {
        sortedA = c;
        sortedB = b;
      }
    } else if (((a < b) && (a > c)) || ((a > b) && (a < c ))) { // a is in between
      sortedB = a;
      if (b > c) {
        sortedA = b;
        sortedC = c;
      } else {
        sortedA = c;
        sortedC = b;
      }
    }

    System.out.println(sortedA + ", " + sortedB + ", " + sortedC);
  }
}
