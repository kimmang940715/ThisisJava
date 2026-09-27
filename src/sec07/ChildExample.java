package sec07;

public class ChildExample {
    static void main() {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();;
    }
}
