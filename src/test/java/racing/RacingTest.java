package racing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racing.controller.GameSetup;
import racing.domain.Car;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;

class RacingTest {
    String[] CAR_NAMES;
    GameSetup newGame;

    @BeforeEach
    void beforeSetup() {
        CAR_NAMES = "SONNY,HWANG,LEE,KIM,PARK".split(",");
        newGame = new GameSetup(3, List.of(CAR_NAMES));
    }

    @AfterEach
    void cleanUp() {
        newGame.cars().clear();
    }

    @Test
    void assertGameSetup() {
        assertThat(newGame.cars().size()).isEqualTo(5);
        assertThat(newGame.round()).isEqualTo(3);
        assertThat(newGame.cars().get(0).name()).isEqualTo("SONNY");
    }

    @Test
    void assertValidateWinner() {
        Car car = new Car("JUNG", 10);
        newGame.cars().add(car);

        assertThat(newGame.presentWinners().get(0)).isEqualTo("JUNG");
    }
}