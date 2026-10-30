package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

    private final T2 solution = new T2();

    @Test
    void returnsNineteenForExample1() {
        assertThat(solution.differenceOfSums(10, 3)).isEqualTo(19);
    }

    @Test
    void returnsFifteenForExample2() {
        assertThat(solution.differenceOfSums(5, 6)).isEqualTo(15);
    }

    @Test
    void returnsMinusFifteenForExample3() {
        assertThat(solution.differenceOfSums(5, 1)).isEqualTo(-15);
    }

    @Test
    void returnsMinusOneForMinimumValues() {
        assertThat(solution.differenceOfSums(1, 1)).isEqualTo(-1);
    }

    @Test
    void returnsOneForSingleNumberNotDivisible() {
        assertThat(solution.differenceOfSums(1, 2)).isEqualTo(1);
    }

    @Test
    void returnsSumOfAllWhenNoNumberIsDivisible() {
        assertThat(solution.differenceOfSums(4, 5)).isEqualTo(10);
    }

    @Test
    void returnsNegativeTotalWhenEveryNumberIsDivisible() {
        assertThat(solution.differenceOfSums(1000, 1)).isEqualTo(-500_500);
    }

    @Test
    void returnsMinusFiveHundredForMaximumNAndEvenDivisor() {
        assertThat(solution.differenceOfSums(1000, 2)).isEqualTo(-500);
    }

    @Test
    void returnsCorrectValueForMaximumValues() {
        assertThat(solution.differenceOfSums(1000, 1000)).isEqualTo(498_500);
    }
}