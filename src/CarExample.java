public class CarExample {
    static void main() {
        Car myCar = new Car();
        
        myCar.setGas(5);
        
        if(myCar.isLeftGas()) {
            System.out.println("출발합니다");

            myCar.run();
        }
        System.out.println("gas 를 주입하세요");
       
    }
    
    
}
