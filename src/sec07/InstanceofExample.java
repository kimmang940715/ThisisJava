package sec07;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("name : " + person.name);
        person.walk();

        // Person 이 참조하는 객체가 Student 타입인지 확인

        if (person instanceof Student) {
            // Student 객체일 경우 강테 타입 변환
            Student student = (Student) person;
            // Student 객체만 가지고 있는 필드 및 메소드 사용
            System.out.println("StudentNo : " + student.studentNo);
            student.study();

        }

        // Person 이 참조하는 객체가 Student 타입일 경우
        // Student 변수에 대입(타입 변환 발생)
        if (person instanceof Student student) {
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }
    }

    static void main() {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
