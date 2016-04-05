public class Car extends Vehicle {
    private int seats;

    public Car(String license, int hp, int seats) {
        super(license, hp);

        this.seats = seats;
    }

    public void print() {
        super.print();
        System.out.println("Seats: " + seats);
    }
}
