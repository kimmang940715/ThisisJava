public class SumFrom1To100Example {
    static void main() {
        int sum = 0;
        int i;

        for (i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("1~" + ( i - 1) + " 합 : " + sum);
    }
}
