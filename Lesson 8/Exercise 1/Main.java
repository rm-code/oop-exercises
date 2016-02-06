public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("ABCDE", 200, 2000);
        Car   car   = new Car("ABCDE", 200, 4);
        truck.print();
        car.print();
    }
}
