package racingcar.domain;

public class Car {
    private final String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Car(String name){
        this.name = name;
        this.position = 0;
    }

    public void validCarName(String carName) {
        if(!validCarNameLength(carName)){
            throw new IllegalArgumentException("[ERROR]자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    public boolean validMove(int randomNo) {
        return randomNo >=4;
    }

    public  int move(int randomNo) {
        if(validMove(randomNo)){
            this.position++;
        }
        return this.position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public boolean validCarNameLength(String carName) {
        return carName.length() < 6;
    }
}
