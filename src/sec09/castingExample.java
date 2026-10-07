package sec09;

public class castingExample {
    static void main() {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
