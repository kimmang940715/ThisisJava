        import java.util.Arrays;
        import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                // 입력: 10 20 10 30 10
                // 찾을 숫자: 10
                int count = 0;
                int search = 0;
                int[] int_array = new int[5];

                for (int i = 0; i < int_array.length; i++) {
                    int_array[i] = sc.nextInt();
                }
                System.out.println("찾을 숫자를 입력해주세요");
                search = sc.nextInt();
                for (int j = 0; j < int_array.length; j++) {

                    if (int_array[j] == search){
                        System.out.println(j +"번쨰");
                    }
                }

                System.out.println(count);
            }
        }