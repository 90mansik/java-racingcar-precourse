package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingSystemTest {

    @Test
    public void 쉼표로_이름_분리(){
        RacingSystem racingSystem = new RacingSystem();
        //given
        String name = "pobi,crong,honux";
        //when
        List<Car> cars = racingSystem.addCarsName(name);
        //then
        Assertions.assertThat(cars.get(0).getName()).isEqualTo("pobi");
        Assertions.assertThat(cars.get(1).getName()).isEqualTo("crong");
        Assertions.assertThat(cars.get(2).getName()).isEqualTo("honux");

    }
}