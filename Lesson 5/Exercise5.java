public class Exercise5 {
    public static void main(String[] args) {
        double result = Math.random();
        int roll = (int) (result * 6);
        System.out.println("The die shows " + (roll + 1));
    }
}
