package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

    private final T2 solution = new T2();

    @Test
    void returnsTwoForExample1() {
        assertThat(solution.findComplement(5)).isEqualTo(2);
    }

    @Test
    void returnsZeroForExample2() {
        assertThat(solution.findComplement(1)).isZero();
    }

    @Test
    void returnsOneForTwo() {
        assertThat(solution.findComplement(2)).isEqualTo(1);
    }

    @Test
    void returnsZeroForAllOnesNumber() {
        assertThat(solution.findComplement(7)).isZero();
    }

    @Test
    void returnsSevenForPowerOfTwo() {
        assertThat(solution.findComplement(8)).isEqualTo(7);
    }

    @Test
    void returnsFiveForAlternatingBits() {
        assertThat(solution.findComplement(10)).isEqualTo(5);
    }

    @Test
    void returnsZeroForMaximumValue() {
        assertThat(solution.findComplement(Integer.MAX_VALUE)).isZero();
    }

    @Test
    void returnsAllOnesBelowHighestBitForLargestPowerOfTwo() {
        assertThat(solution.findComplement(1 << 30)).isEqualTo((1 << 30) - 1);
    }

    @Test
    void returnsComplementForLargeNumberWithLowestBitSet() {
        assertThat(solution.findComplement((1 << 30) + 1)).isEqualTo((1 << 30) - 2);
    }
}