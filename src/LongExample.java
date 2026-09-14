public class LongExample {
    static void main() {
        long var1 = 10;
        long var2 = 20L;
        //long var3 = 100000000000; // 컴파일러는 int 로 간주 하여 에러
        long var4 = 100000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
