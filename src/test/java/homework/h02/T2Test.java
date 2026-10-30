package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

    private final T2 solution = new T2();

    @Test
    void returnsTrueForExample1() {
        assertThat(solution.isSameAfterReversals(526)).isTrue();
    }

    @Test
    void returnsFalseForExample2() {
        assertThat(solution.isSameAfterReversals(1800)).isFalse();
    }

    @Test
    void returnsTrueForExample3() {
        assertThat(solution.isSameAfterReversals(0)).isTrue();
    }

    @Test
    void returnsTrueForSingleDigitNumber() {
        assertThat(solution.isSameAfterReversals(1)).isTrue();
    }

    @Test
    void returnsFalseForNumberWithOneTrailingZero() {
        assertThat(solution.isSameAfterReversals(10)).isFalse();
    }

    @Test
    void returnsTrueForNumberWithoutTrailingZeros() {
        assertThat(solution.isSameAfterReversals(999_999)).isTrue();
    }

    @Test
    void returnsFalseForMaximumValue() {
        assertThat(solution.isSameAfterReversals(1_000_000)).isFalse();
    }
}