package racingcar.domain;

public class Car {
    private final String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public boolean validCarName(String carName) {
        return carName.length() < 6;
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
}
