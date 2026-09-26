public class CarExample {
    static void main() {

        Car myCar = new Car();

        myCar.setSpeed(-50);
        System.out.println("현재 속도 : " + myCar.getSpeed());


        myCar.setSpeed(50);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        if (!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("현재 속도 : " + myCar.getSpeed());

    }
    
    
}
