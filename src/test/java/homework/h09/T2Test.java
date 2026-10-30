package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

    private final T2 solution = new T2();

    @Test
    void returnsExpectedListForExample1() {
        assertThat(solution.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3))
                .containsExactly(true, true, true, false, true);
    }

    @Test
    void returnsExpectedListForExample2() {
        assertThat(solution.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1))
                .containsExactly(true, false, false, false, false);
    }

    @Test
    void returnsExpectedListForExample3() {
        assertThat(solution.kidsWithCandies(new int[] {12, 1, 12}, 10))
                .containsExactly(true, false, true);
    }

    @Test
    void returnsTrueForMinimumLength() {
        assertThat(solution.kidsWithCandies(new int[] {1, 1}, 1)).containsExactly(true, true);
    }

    @Test
    void returnsTrueWhenSumEqualsMaximum() {
        assertThat(solution.kidsWithCandies(new int[] {3, 5}, 2)).containsExactly(true, true);
    }

    @Test
    void returnsFalseWhenSumIsLessThanMaximum() {
        assertThat(solution.kidsWithCandies(new int[] {3, 5}, 1)).containsExactly(false, true);
    }

    @Test
    void returnsOnlyMaximumHolderForMinimumExtraCandies() {
        assertThat(solution.kidsWithCandies(new int[] {1, 5, 3}, 1))
                .containsExactly(false, true, false);
    }

    @Test
    void returnsAllTrueForMaximumExtraCandies() {
        assertThat(solution.kidsWithCandies(new int[] {1, 100, 50}, 50))
                .containsExactly(true, true, true);
    }

    @Test
    void returnsAllTrueWhenAllKidsHaveEqualCandies() {
        assertThat(solution.kidsWithCandies(new int[] {4, 4, 4}, 1))
                .containsExactly(true, true, true);
    }

    @Test
    void keepsOrderOfKids() {
        assertThat(solution.kidsWithCandies(new int[] {5, 1, 5, 1}, 1))
                .containsExactly(true, false, true, false);
    }
}