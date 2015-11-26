public class Truck extends Vehicle {
    private int maxWeight;

    public Truck(String license, int hp, int maxWeight) {
        super(license, hp);

        this.maxWeight = maxWeight;
    }

    public void print() {
        super.print();
        System.out.println("Max Weight: " + maxWeight);
    }
}
