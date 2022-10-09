package racingcar.domain;

public class Car {
    private final String name;
    private final String position;

    public Car(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public static boolean validCarName(String carName) {
        return carName.length() < 6;
    }
}
