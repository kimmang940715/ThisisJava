package sec08;

public interface Service {
    default void defaultMethod1() {
        System.out.println("default Method1 종속 코드");

    }

    default void defaultMethod2() {
        System.out.println("default Method2 종속코드");
    }

    private void defaultCommon() {
        System.out.println("defaultMethod 중복 코드 A");
        System.out.println("defaultMethod 중복 코드 B");
    }

    static void staticMethod1() {
        System.out.println("staticMethod1 종속코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 종속코드");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("staticMethod 중복 코드 C");
        System.out.println("staticMethod 중복 코드 D");
    }

}
