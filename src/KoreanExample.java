public class KoreanExample {
    static void main() {
        Korean k1 = new Korean("123456-1234567", "감자바");

        System.out.println(k1.name);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // Final 필드 변경 불가
        // k1.nation = "USA";

        k1.name = "김자바";

        System.out.println(k1.name);
    }
}
