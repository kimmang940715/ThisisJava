package sec08;

public class RemoteControlExample {
    static void main() {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
    }
}
