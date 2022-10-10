package racingcar.domain;

import racingcar.constant.ErrorMessage;

public class Position {

    public static final int POSITION_MIN = 0;

    private int position;

    public Position() {
    }

    public Position(String position) {
        try {
            this.position = Integer.parseInt(position);
            if (this.position < POSITION_MIN) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorMessage.POSITION_NUMBER_FORMAT_VALID_ERROR.getMessage());
        }
    }

    public int getPosition() {
        return position;
    }

    public int addPosition() {
        return this.position++;
    }


}
