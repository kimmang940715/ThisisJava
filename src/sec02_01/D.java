package sec02_01;

import sec02.A;

public class D extends A {
    public D () {
        super();
    }

    public void method1() {
        this.field = "value";
        this.method();
    }

    public void method2() {
       /*
        A a  = new A();
        a.field = "value";
        a.method();

        */
    }
}
