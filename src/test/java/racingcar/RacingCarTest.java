package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class RacingCarTest {
    RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar("pobi,crong,honux");
    }

    @Test
    void 레이싱을_시도한다(){
        System.out.println(racingCar.play());
    }

    @Test
    void 레이싱_결과를_반환한다(){
        System.out.println(racingCar.play());

        System.out.println(racingCar.result());
    }
}
