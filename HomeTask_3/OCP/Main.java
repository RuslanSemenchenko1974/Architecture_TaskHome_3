package OCP;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(300, "train");
        printSpeed(vehicle);
        vehicle = new Car(200);
        printSpeed(vehicle);
        vehicle = new Bus(100);
        printSpeed(vehicle);
    }

    public static void printSpeed(Vehicle vehicle) {
        System.out.println(vehicle.type + " Max speed " + vehicle.calculateAllowedSpeed());
    }
}
