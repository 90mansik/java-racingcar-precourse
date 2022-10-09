package racingcar.domain;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class CarTest {

    @Test
    public void 자동차_이름_유효성_검증(){
        Assertions.assertThat(Car.validCarName("testcase")).isFalse();
        Assertions.assertThat(Car.validCarName("pobi")).isTrue();
        Assertions.assertThat(Car.validCarName("crong")).isTrue();
        Assertions.assertThat(Car.validCarName("honux")).isTrue();
    }



}