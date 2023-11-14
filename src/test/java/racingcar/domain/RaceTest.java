package racingcar.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.rule.MinimumRule;
import racingcar.util.BasicNumberGenerator;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RaceTest {
    @ParameterizedTest(name = "입력값({0})이 경기 규칙 최소값({1}) 이상이면 자동차의 이동거리({2})가 증가한다. 경기기록 값이 반환된다.")
    @CsvSource(value = {"3:4:0", "4:4:1", "5:4:1"}, delimiter = ':')
    public void race_start_car_distance_increase(int input, int minimum, int distance) {

        Cars cars = Cars.ofString(Arrays.asList("carA", "carB", "carC"));

        BasicNumberGenerator generator = new BasicNumberGenerator(input);
        MinimumRule rule = new MinimumRule(minimum, generator);

        Race race = new Race(cars, rule);
        RaceRecords raceRecords = race.start();

        for (RaceRecord raceRecord : raceRecords.getRaceRecords()) {
            assertThat(raceRecord.position()).isEqualTo(new Position(distance));
        }
    }
}