package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

    private final T1 solution = new T1();

    @Test
    void returnsTenForExample1() {
        assertThat(solution.smallestEvenMultiple(5)).isEqualTo(10);
    }

    @Test
    void returnsSixForExample2() {
        assertThat(solution.smallestEvenMultiple(6)).isEqualTo(6);
    }

    @Test
    void returnsTwoForMinimumValue() {
        assertThat(solution.smallestEvenMultiple(1)).isEqualTo(2);
    }

    @Test
    void returnsSameNumberForMaximumEvenValue() {
        assertThat(solution.smallestEvenMultiple(150)).isEqualTo(150);
    }

    @Test
    void returnsDoubleForMaximumOddValue() {
        assertThat(solution.smallestEvenMultiple(149)).isEqualTo(298);
    }
}