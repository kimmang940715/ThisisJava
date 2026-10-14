package sec12;

public class ThrowsExample2 {
    static void main() throws Exception{
        findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
