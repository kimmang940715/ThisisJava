package sec02;

public class ComputerExample {
    static void main() {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCicle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCicle(r));
    }
}
