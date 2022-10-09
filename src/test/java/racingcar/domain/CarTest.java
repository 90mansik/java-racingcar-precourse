package racingcar.domain;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CarTest {
    private Car car;

    @BeforeEach
    void setUp(){
        car = new Car("name",0);

    }

    @Test
    public void 자동차_이름_유효성_검증(){
        Assertions.assertThat(car.validCarName("testcase")).isFalse();
        Assertions.assertThat(car.validCarName("pobi")).isTrue();
        Assertions.assertThat(car.validCarName("crong")).isTrue();
        Assertions.assertThat(car.validCarName("honux")).isTrue();
    }

    @Test
    public void 자동차_전진_유효성_검증(){
        Assertions.assertThat(car.validMove(4)).isTrue();
        Assertions.assertThat(car.validMove(5)).isTrue();
        Assertions.assertThat(car.validMove(3)).isFalse();
        Assertions.assertThat(car.validMove(-1)).isFalse();
    }

    @Test
    public void 자동차_전진_검증(){
        Assertions.assertThat(car.move(4)).isEqualTo(1);
        Assertions.assertThat(car.move(3)).isEqualTo(1);
        Assertions.assertThat(car.move(5)).isEqualTo(2);
    }



}