package sec13;

import sec08.C;

public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent() {
        return new Car();
    }

}
