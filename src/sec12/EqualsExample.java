package sec12;

public class EqualsExample {
    static void main() {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");
        
        if(obj1.equals(obj2)){
            System.out.println("obj1 과 obj2 는 동등합니다");
        }else {
            System.out.println("obj과 obj2 는 동등하지 않습니다.");
        }
        
        if(obj1.equals(obj3)) {
            System.out.println("obj1과 obj3 은 동등합니다");
        } else {
            System.out.println("obj1과 obj은 동등하지 않습니다");
        }
    }
}
