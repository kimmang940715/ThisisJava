public class FloatDoubleExample {
    /*
     * 타입      메모리 크기    저장되는 값의 허용 범위 (양수기준)   유효 소수 이하 자리
     * float  : 4byte 32bit  1.4 x 10^-45 ~ 3.4 x 10^34      7자리
     * double : 8byte 64bit  4.9 xx= 10^-324 ~ 1.8 x 10^308  15자리
     * */


    static void main() {

        // 정밀도 확인
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);

        // 10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);
    }
}
