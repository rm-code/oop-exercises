public class Exercise3 {
    public static void main(String[] args) {
        int x = 2, y = 8, z = 4; // The values to sort.

        if (x > y && x > z) { // Check if x is the biggest number.
            // If x is the biggest number we only need to compare y and z.
            if (y > z) {
                System.out.println(x + ", " + y + ", " + z);
            } else {
                System.out.println(x + ", " + z + ", " + y);
            }
        } else if (x < y && x < z) { // Check if x is the smallest number.
            if (y > z) {
                System.out.println(y + ", " + z + ", " + x);
            } else {
                System.out.println(z + ", " + y + ", " + x);
            }
        } else if (x < z && x > y) { // Check if x lies between z and y with z being the bigger and y the smaller number.
            System.out.println(z + ", " + x + ", " + y);
        } else if (x < y && x > z) { // Check if x lies between z and y with y being the bigger and z the smaller number.
            System.out.println(y + ", " + x + ", " + z);
        }
    }
}
