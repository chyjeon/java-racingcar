package racewinner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import racewinner.strategy.RandomMoveStrategy;

import static org.assertj.core.api.Assertions.assertThat;

class RandomMoveStrategyTest {

    @DisplayName("getNumber()는 항상 0에서 10사이의 값을 반환 한다.")
    @RepeatedTest(5)
    void getNumberTest() {
        // given
        final RandomMoveStrategy randomMoveStrategy = new RandomMoveStrategy();

        // when
        final int number = randomMoveStrategy.getNumber();

        //then
        assertThat(number >= 0 && number <= 10).isTrue();
    }
}