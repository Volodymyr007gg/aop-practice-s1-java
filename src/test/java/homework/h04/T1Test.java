package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

    private final T1 solution = new T1();

    @Test
    void returnsTwoForExample1() {
        assertThat(solution.hammingDistance(1, 4)).isEqualTo(2);
    }

    @Test
    void returnsOneForExample2() {
        assertThat(solution.hammingDistance(3, 1)).isEqualTo(1);
    }

    @Test
    void returnsZeroForMinimumValues() {
        assertThat(solution.hammingDistance(0, 0)).isZero();
    }

    @Test
    void returnsZeroForEqualNumbers() {
        assertThat(solution.hammingDistance(5, 5)).isZero();
    }

    @Test
    void returnsOneForZeroAndOne() {
        assertThat(solution.hammingDistance(0, 1)).isEqualTo(1);
    }

    @Test
    void returnsSameResultWhenArgumentsAreSwapped() {
        assertThat(solution.hammingDistance(4, 1)).isEqualTo(2);
    }

    @Test
    void returnsZeroForEqualMaximumValues() {
        assertThat(solution.hammingDistance(Integer.MAX_VALUE, Integer.MAX_VALUE)).isZero();
    }

    @Test
    void returnsThirtyOneForZeroAndMaximumValue() {
        assertThat(solution.hammingDistance(0, Integer.MAX_VALUE)).isEqualTo(31);
    }

    @Test
    void returnsThirtyForMaximumValueAndOne() {
        assertThat(solution.hammingDistance(Integer.MAX_VALUE, 1)).isEqualTo(30);
    }
}