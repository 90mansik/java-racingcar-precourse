package racingcar.domain;

public class Car {
    public static final int POSITION_MOVE_STANDARD_NO = 4;
    private final CarName name;
    private int position;


    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = position;
    }

    public Car(String name) {
        this.name = new CarName(name);
        this.position = 0;
    }


    public boolean validMove(int randomNo) {
        return randomNo >= POSITION_MOVE_STANDARD_NO;
    }

    public int move(int randomNo) {
        if (validMove(randomNo)) {
            this.position++;
        }
        return this.position;
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position;
    }


}
