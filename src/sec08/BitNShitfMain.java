package sec08;

public class BitNShitfMain {
    public static String shifts(int a) {
        String s = "";
        for (int i = 0; i <= 31; i++) {
            int aa = a % 2 ;
            s = (aa >= 0) ? aa + s : (-aa) + s;
            a >>= 1 ;
        }
        return s;
    }

    static void main() {
        int intNums1 = 123;
        int intNums2 = -123;
        System.out.printf("%d : %s%n", intNums1, shifts(intNums1));
        System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
    }
}
