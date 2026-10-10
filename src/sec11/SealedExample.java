package sec11;

public class SealedExample {
    static void main() {
        ImplClass impl = new ImplClass();

        InterfaceA ia = impl;
        ia.methodA();

        System.out.println();

        InterfaceB ib = impl;
        ib.methodA();
        ib.methodB();

        System.out.println();


        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
