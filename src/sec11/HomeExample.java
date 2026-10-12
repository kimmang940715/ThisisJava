package sec11;

public class HomeExample {
    static void main() {
        Home home = new Home();

        home.use1();

        home.use2();

        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("난방을 켭니다");
            }

            @Override
            public void turhOff() {
                System.out.println("난방을 끕니다");
            }
        });
    }
}
