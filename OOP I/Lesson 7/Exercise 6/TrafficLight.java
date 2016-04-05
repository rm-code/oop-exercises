public class TrafficLight {
    private String[] COLORS = { "RED", "RED-YELLOW", "YELLOW", "GREEN" };
    private int index = 0;
    private int direction = 1;

    public void change() {
        index = index + direction;
        if (direction == 1 && index == COLORS.length - 1) {
            direction = -1;
        } else if (direction == -1 && index == 0) {
            direction = 1;
        }
    }

    public String getColor() {
        return COLORS[index];
    }
}
