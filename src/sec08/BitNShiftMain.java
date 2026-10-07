package sec08;

public class BitNShiftMain {
    public static String shifts(int a) {
        int BITMASK = 1;
        String s = "";
        for (int i = 0; i <= 31; i++) {
            s = (a & BITMASK) + s;
            a >>= 1;
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
