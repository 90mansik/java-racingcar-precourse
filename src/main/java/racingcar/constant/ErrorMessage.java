package racingcar.constant;

public enum ErrorMessage {

    CAR_NAME_RANGE_ERROR("[ERROR]자동차 이름은 5자 이하만 가능합니다.")
    ,POSITION_NUMBER_FORMAT_VALID_ERROR("0 이상의 유효한 범위의 숫자를 입력해야 한다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
