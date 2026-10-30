package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

    private final T1 solution = new T1();

    @Test
    void returnsFourForExample1() {
        assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3})).isEqualTo(4);
    }

    @Test
    void returnsSixForExample2() {
        assertThat(solution.numIdenticalPairs(new int[] {1, 1, 1, 1})).isEqualTo(6);
    }

    @Test
    void returnsZeroForExample3() {
        assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3})).isZero();
    }

    @Test
    void returnsZeroForSingleElement() {
        assertThat(solution.numIdenticalPairs(new int[] {1})).isZero();
    }

    @Test
    void returnsOneForTwoEqualElements() {
        assertThat(solution.numIdenticalPairs(new int[] {5, 5})).isEqualTo(1);
    }

    @Test
    void returnsZeroForTwoDifferentElements() {
        assertThat(solution.numIdenticalPairs(new int[] {1, 2})).isZero();
    }

    @Test
    void countsPairsOfNonAdjacentEqualElements() {
        assertThat(solution.numIdenticalPairs(new int[] {7, 1, 7})).isEqualTo(1);
    }

    @Test
    void countsPairsForSeveralGroups() {
        assertThat(solution.numIdenticalPairs(new int[] {1, 1, 2, 2, 2})).isEqualTo(4);
    }

    @Test
    void handlesMinimumAndMaximumValues() {
        assertThat(solution.numIdenticalPairs(new int[] {1, 100, 1, 100, 100})).isEqualTo(4);
    }

    @Test
    void returnsAllPairsForMaximumLength() {
        int[] nums = new int[100];
        java.util.Arrays.fill(nums, 100);

        assertThat(solution.numIdenticalPairs(nums)).isEqualTo(4_950);
    }
}