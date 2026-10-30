package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

    private final T2 solution = new T2();

    @Test
    void returnsSixForExample1() {
        assertThat(solution.numberOfSteps(14)).isEqualTo(6);
    }

    @Test
    void returnsFourForExample2() {
        assertThat(solution.numberOfSteps(8)).isEqualTo(4);
    }

    @Test
    void returnsTwelveForExample3() {
        assertThat(solution.numberOfSteps(123)).isEqualTo(12);
    }

    @Test
    void returnsZeroForMinimumValue() {
        assertThat(solution.numberOfSteps(0)).isZero();
    }

    @Test
    void returnsOneForOne() {
        assertThat(solution.numberOfSteps(1)).isEqualTo(1);
    }

    @Test
    void returnsTwoForTwo() {
        assertThat(solution.numberOfSteps(2)).isEqualTo(2);
    }

    @Test
    void returnsFiveForOddNumberWithAllBitsSet() {
        assertThat(solution.numberOfSteps(7)).isEqualTo(5);
    }

    @Test
    void returnsTwentyForPowerOfTwo() {
        assertThat(solution.numberOfSteps(524_288)).isEqualTo(20);
    }

    @Test
    void returnsTwentySixForMaximumValue() {
        assertThat(solution.numberOfSteps(1_000_000)).isEqualTo(26);
    }
}