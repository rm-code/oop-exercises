public class Vehicle {
    private String license;
    private int hp;

    public Vehicle(String license, int hp) {
        this.license = license;
        this.hp = hp;
    }

    public void print() {
        System.out.print("License: " + license + ", HP: " + hp + ", ");
    }
}
