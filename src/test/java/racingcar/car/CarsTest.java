package racingcar.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    private Cars cars;

    @BeforeEach
    void init() {
        this.cars = new Cars();
    }

    @Test
    @DisplayName("Car 추가 성공 테스트")
    void addCar_성공() {
        cars.addCars(2);
        assertThat(cars.getCars().size()).isEqualTo(2);
    }

    @Test
    @DisplayName("Cars 생성 성공 테스트")
    void setCars_성공() {
        cars.addCars(3);
        assertThat(cars.getCars().size()).isEqualTo(3);
    }

}
