package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RacingSystem {

    private List<Car> cars;
    private int randomNo;

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

    public void createRandomNo() {
        this.randomNo = Randoms.pickNumberInRange(0,9);
    }


    public int getRandomNo(){
        createRandomNo();
        return this.randomNo;
    }
}
