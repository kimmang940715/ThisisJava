package sec08;

public class PrimMath {
    public static boolean isPrime(int n) {
        boolean isS = true;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                isS = false;
                break;
            }
        }
        return isS;

    }

    static void main() {
        int number = 1234567;
        boolean ifPrime = isPrime(number);
        if (ifPrime) {
            System.out.printf("%d는 1과 자신으로만 나눠떨어지는 소수다", number);
        } else {
            System.out.printf("%d 는 소수가 아니다", number);
        }
    }
}
