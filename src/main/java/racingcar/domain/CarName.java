package racingcar.domain;

public class CarName {
    public static final int NAME_MAX_LENGTH = 6;

    private String name;


    public CarName() {
    }

    public CarName(String name) {
        if (!validCarNameLength(name)) {
            throw new IllegalArgumentException("[ERROR]자동차 이름은 5자 이하만 가능합니다.");
        }
        this.name = name;
    }

    public boolean validCarNameLength(String carName) {
        return carName.length() < NAME_MAX_LENGTH;
    }

    public String getName() {
        return name;
    }
}
