package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    @Test
    void 랜덤값이_4보다_작으면_전진하지_않는다(){
        Car car = new Car("자동차");

        assertThat(car.moveForward(3)).isEqualTo(0);
    }

    @Test
    void 랜덤값이_4보다_크면_전진한다(){
        Car car = new Car("자동차");

        assertThat(car.moveForward(4)).isEqualTo(1);
    }
}
