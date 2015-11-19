import java.util.Scanner;

public class Planner {
    public static void main(String[] args) {
        Room room = new Room();

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Do you want to add (0) or remove (1) a lesson? Press (2) to exit the program: ");

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
                break;
            }

            room.showPlan();
        }
    }
}
