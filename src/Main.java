        import java.util.Arrays;
        import java.util.Scanner;

        /*
        정수 : byte, char, short, int, long
        실수 : float, double
        논리 : boolean

        메모리 사용 크기 (단위 bit)
        byte : 8
        short : 16
        int : 32
        long : 64
         */


        public class Main {
            public static void main(String[] args) {
                int x = 3;
                int y = 5;

                System.out.println("x : " + x + " y : " + y);

                int temp  = x;
                x = y;
                y = temp;

                System.out.println("x : " + x + " y : " + y);

            }
        }