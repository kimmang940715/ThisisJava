package sec11;

public class InstanceofExample {
    static void main() {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        }

        vehicle.run();
    }
}
