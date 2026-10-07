package sec09;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();

        Searchable searchble = new Searchable() {
            @Override
            public void search(String url) {

            }
        };
        searchble.search("https://www.youtube.com");
    }
}
