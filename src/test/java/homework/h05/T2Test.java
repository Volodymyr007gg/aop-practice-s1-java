
package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

    private final T2 solution = new T2();

    @Test
    void returnsSortedSquaresForExample1() {
        assertThat(solution.sortedSquares(new int[] {-4, -1, 0, 3, 10}))
                .containsExactly(0, 1, 9, 16, 100);
    }

    @Test
    void returnsSortedSquaresForExample2() {
        assertThat(solution.sortedSquares(new int[] {-7, -3, 2, 3, 11}))
                .containsExactly(4, 9, 9, 49, 121);
    }

    @Test
    void returnsSquareForSingleNegativeElement() {
        assertThat(solution.sortedSquares(new int[] {-5})).containsExactly(25);
    }

    @Test
    void returnsZeroForSingleZero() {
        assertThat(solution.sortedSquares(new int[] {0})).containsExactly(0);
    }

    @Test
    void reversesOrderForAllNegativeNumbers() {
        assertThat(solution.sortedSquares(new int[] {-3, -2, -1})).containsExactly(1, 4, 9);
    }

    @Test
    void keepsOrderForAllPositiveNumbers() {
        assertThat(solution.sortedSquares(new int[] {1, 2, 3})).containsExactly(1, 4, 9);
    }

    @Test
    void placesLargerNegativeSquareAtTheEnd() {
        assertThat(solution.sortedSquares(new int[] {-5, 1})).containsExactly(1, 25);
    }

    @Test
    void placesLargerPositiveSquareAtTheEnd() {
        assertThat(solution.sortedSquares(new int[] {-1, 5})).containsExactly(1, 25);
    }

    @Test
    void handlesEqualAbsoluteValues() {
        assertThat(solution.sortedSquares(new int[] {-2, -2, 2, 2})).containsExactly(4, 4, 4, 4);
    }

    @Test
    void handlesMinimumAndMaximumBounds() {
        assertThat(solution.sortedSquares(new int[] {-10_000, 10_000}))
                .containsExactly(100_000_000, 100_000_000);
    }
}
