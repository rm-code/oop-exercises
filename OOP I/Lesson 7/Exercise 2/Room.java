public class Room {
    private boolean[] lessons = new boolean[24];

    public void add(int time) {
        if (time < 0 || time > lessons.length - 1) {
            System.out.println("Please only use timestamps between 0 and 23!");
        } else if (lessons[time]) {
            System.out.println("The room is already taken at this time.");
        } else {
            lessons[time] = true;
        }
    }

    public void remove(int time) {
        if (time < 0 || time > lessons.length - 1) {
            System.out.println("Please only use timestamps between 0 and 23!");
        } else if (!lessons[time]) {
            System.out.println("The room is still available at this time.");
        } else {
            lessons[time] = false;
        }
    }

    public void showPlan() {
        System.out.println("Times:");
        for (int i = 0; i < lessons.length - 1; i++) {
            System.out.println(i + ": " + lessons[i]);
        }
    }
}
