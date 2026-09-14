public class CharExample {
    static void main() {
        char c1 = 'A'; // 문자저장
        char c2 = 65; //  유니코드 직접 저장

        char c3 = '가'; // 문자 저장
        char c4 = 44032; // 유니코드 직접 저장

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        //char 타입은 변수 초기화시 empty 이면 에러 발생
        // 빈 값 (공백) 을 추가해주어야 한다
    }
}
