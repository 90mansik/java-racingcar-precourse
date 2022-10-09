package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


class RacingSystemTest {

    private RacingSystem racingSystem;

    @BeforeEach
    public void setUp() {
        racingSystem = new RacingSystem();
    }

    @Test
    public void 쉼표로_이름_분리() {
        //given
        String name = "pobi,crong,honux";
        //when
        List<Car> cars = racingSystem.addCarsName(name);
        //then
        Assertions.assertThat(cars.get(0).getName()).isEqualTo("pobi");
        Assertions.assertThat(cars.get(1).getName()).isEqualTo("crong");
        Assertions.assertThat(cars.get(2).getName()).isEqualTo("honux");

    }

    @Test
    public void 랜덤_숫자_생성_검증() {
        //when
        int randomNo = racingSystem.getRandomNo();
        //then
        Assertions.assertThat(randomNo).isNotNull();
    }

    @Test
    @DisplayName("1~9사이의 숫자가 생성되는지 유효성 검증")
    public void 랜덤_숫자_유효성_검증() {
        //given
        int randomNo = racingSystem.getRandomNo();
        //when
        boolean result = randomNo >= 0 && randomNo <= 9 ? true : false;
        //then
        Assertions.assertThat(result).isTrue();

    }


}