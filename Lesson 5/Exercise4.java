import java.util.Scanner;

public class Exercise4 {
    static long move(int plates) {
        long steps = 1;

        if (plates > 1) {
            steps += move(plates - 1);
            steps += move(plates - 1);

            return steps;
        }

        return steps;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("With how many plates do you want to play? ");
        int  plates = input.nextInt();
        long result = move(plates);

        System.out.println(plates + " plates need " + result + " steps to be moved.");
    }
}
