public class WhileSumFrom1To100Example {
    static void main() {
        int sum = 0;

        int i = 1;

        while ( i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("1 ~ " + (i - 1) + "합 : " + sum);
    }
}
