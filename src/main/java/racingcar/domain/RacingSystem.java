package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingSystem {

    private List<Car> cars;

    public String[] splitCarsName(String carsName, String regex) {

        return carsName.split(",");
    }

    public List<Car> addCarsName(String name) {
        List<Car>  cars = new ArrayList<>();

        for (String carName: name.split(",")) {
            cars.add(new Car(carName));
        }

        return cars;
    }
}
