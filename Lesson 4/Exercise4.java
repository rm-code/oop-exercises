public class Exercise4 {
    public static void main(String[] args) {
        int a, b, c;    // The values used in our quadratic equation (ax^2 + bx + c = 0).
        float x1, x2;   // The results calculated with the quadratic formula.

        // Parse the integers from the cmd line args.
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        // Calculate the discriminant.
        float sqrt = (float) Math.sqrt(Math.pow(b, 2) - (4 * a * c));

        System.out.print("A quadratic equation with the values a: " + a + ", b: " + b + ", c: " + c);

        // Base the results on the discriminant.
        if (sqrt > 0) {
            x1 = (-b + sqrt) / (2 * a);
            x2 = (-b - sqrt) / (2 * a);
            System.out.println(" has the two solutions: " + x1 + ", " + x2);
        } else if (sqrt == 0) {
            x1 = (-b + sqrt) / (2 * a);
            System.out.println(" has one solution: " + x1);
        } else {
            System.out.println(" has no real solutions.");
        }
    }
}
