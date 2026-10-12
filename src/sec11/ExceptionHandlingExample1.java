package sec11;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수 : " + result);
    }

    static void main() {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // nullException 에러 발생
        System.out.println("[프로그램 종료 ]");
    }
}
