package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RacingSystem {

    private List<Car> cars;
    private int randomNo;
    private int finishPosition;

    public RacingSystem(){}
    public RacingSystem(int finishPosition){
        this.finishPosition = finishPosition;
    }
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

    public boolean finishRacing(int position) {
        if( finishPosition == position){
            return true;
        }
        return false;
    }

    public String getVictoryCars(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        int index=0;

        for (Car car: cars ) {
            if(finishRacing(car.getPosition())){
                sb.append(makeVictoryCarString(car.getName(), index));
            }
            index++;
        }

        return sb.toString();
    }

    private String makeVictoryCarString(String name, int index){
        if(index != 0){
            name = ", "+name;
        }
        return name;
    }
}
