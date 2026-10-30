package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

    private final T2 solution = new T2();

    @Test
    void returnsThreeForExample1() {
        assertThat(solution.countOdds(3, 7)).isEqualTo(3);
    }

    @Test
    void returnsOneForExample2() {
        assertThat(solution.countOdds(8, 10)).isEqualTo(1);
    }

    @Test
    void returnsZeroForSingleEvenNumber() {
        assertThat(solution.countOdds(0, 0)).isZero();
    }

    @Test
    void returnsOneForSingleOddNumber() {
        assertThat(solution.countOdds(7, 7)).isEqualTo(1);
    }

    @Test
    void returnsHalfOfRangeForMaximumBounds() {
        assertThat(solution.countOdds(0, 1_000_000_000)).isEqualTo(500_000_000);
    }
}