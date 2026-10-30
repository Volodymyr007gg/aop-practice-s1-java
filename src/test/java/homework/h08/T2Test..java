package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class T2Test {

    private final T2 solution = new T2();

    @Test
    void returnsThreeForExample1() {
        assertThat(solution.countPairs(List.of(-1, 1, 2, 3, 1), 2)).isEqualTo(3);
    }

    @Test
    void returnsTenForExample2() {
        assertThat(solution.countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2)).isEqualTo(10);
    }

    @Test
    void returnsZeroForSingleElement() {
        assertThat(solution.countPairs(List.of(0), 1)).isZero();
    }

    @Test
    void returnsOneForPairWithSumLessThanTarget() {
        assertThat(solution.countPairs(List.of(-1, 1), 1)).isEqualTo(1);
    }

    @Test
    void doesNotCountPairWithSumEqualToTarget() {
        assertThat(solution.countPairs(List.of(1, 1), 2)).isZero();
    }

    @Test
    void ignoresOrderOfElements() {
        assertThat(solution.countPairs(List.of(3, 1, -1, 2, 1), 2)).isEqualTo(3);
    }

    @Test
    void countsAllPairsWhenAllSumsAreLessThanTarget() {
        assertThat(solution.countPairs(List.of(-50, -50, -50), 50)).isEqualTo(3);
    }

    @Test
    void returnsZeroWhenNoSumIsLessThanTarget() {
        assertThat(solution.countPairs(List.of(50, 50, 50), -50)).isZero();
    }

    @Test
    void countsPairWithMinimumValuesAndTarget() {
        assertThat(solution.countPairs(List.of(-50, -50), -50)).isEqualTo(1);
    }

    @Test
    void countsPairWithMinimumAndMaximumValues() {
        assertThat(solution.countPairs(List.of(-50, 50), 1)).isEqualTo(1);
    }

    @Test
    void doesNotCountPairWithMinimumAndMaximumValuesWhenSumEqualsTarget() {
        assertThat(solution.countPairs(List.of(-50, 50), 0)).isZero();
    }

    @Test
    void returnsAllPairsForMaximumLength() {
        assertThat(solution.countPairs(Collections.nCopies(50, 0), 1)).isEqualTo(1_225);
    }

    @Test
    void returnsZeroForMaximumLengthWhenTargetEqualsEveryPairSum() {
        assertThat(solution.countPairs(Collections.nCopies(50, 0), 0)).isZero();
    }
}