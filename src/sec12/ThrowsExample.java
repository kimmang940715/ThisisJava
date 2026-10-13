package sec12;

public class ThrowsExample {
    static void main() {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리 : " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
