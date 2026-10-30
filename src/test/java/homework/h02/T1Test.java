package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

    private final T1 solution = new T1();

    @Test
    void returnsTwoForExample1() {
        assertThat(solution.addDigits(38)).isEqualTo(2);
    }

    @Test
    void returnsZeroForExample2() {
        assertThat(solution.addDigits(0)).isZero();
    }

    @Test
    void returnsSameDigitForSingleDigitNumber() {
        assertThat(solution.addDigits(7)).isEqualTo(7);
    }

    @Test
    void returnsOneForPowerOfTen() {
        assertThat(solution.addDigits(10)).isEqualTo(1);
    }

    @Test
    void returnsNineForMultipleOfNine() {
        assertThat(solution.addDigits(18)).isEqualTo(9);
    }

    @Test
    void returnsNineForNine() {
        assertThat(solution.addDigits(9)).isEqualTo(9);
    }

    @Test
    void returnsOneForMaximumValue() {
        assertThat(solution.addDigits(Integer.MAX_VALUE)).isEqualTo(1);
    }
}