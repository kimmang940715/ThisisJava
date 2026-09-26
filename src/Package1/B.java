package Package1;

public class B {
    public void method() {
        A a  = new A();

        a.field1 = 1;
        a.field2 = 1;
        //a.field3 = 1; private 접근불가

        a.method1();
        a.method2();
        //a.method3(); private 접근 불가
    }
}
