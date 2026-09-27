package sec02;

public class Computer extends Calculator{
    @Override
    public double areaCicle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
