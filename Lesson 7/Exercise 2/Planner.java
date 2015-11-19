import java.util.Scanner;

public class Planner {
    public static void main(String[] args) {
        Room room = new Room();

        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("(0) Add new lesson");
        System.out.println("(1) Remove lesson");
        System.out.println("(2) Show plan");
        System.out.println("(3) Exit");

        while (true) {
            System.out.print("> ");

            int selection = input.nextInt();

            if (selection == 0) {
                System.out.print("Please enter the hour you want to add to the plan (0 - 23): ");
                int hour = input.nextInt();
                room.add(hour);
            } else if (selection == 1) {
                System.out.print("Please enter the hour you want to remove from the plan (0 - 23): ");
                int hour = input.nextInt();
                room.remove(hour);
            } else if (selection == 2) {
                room.showPlan();
            } else if (selection == 3) {
                break;
            } else {
                System.out.println("Please enter a valid option (0, 1, 2 or 3)");
            }
        }
    }
}
