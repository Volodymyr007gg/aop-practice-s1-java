package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class T1Test {

    private final T1 solution = new T1();

    @Test
    void returnsThirtyFourForExample1() {
        assertThat(solution.maxProductDifference(new int[] {5, 6, 2, 7, 4})).isEqualTo(34);
    }

    @Test
    void returnsSixtyFourForExample2() {
        assertThat(solution.maxProductDifference(new int[] {4, 2, 5, 9, 7, 4, 8})).isEqualTo(64);
    }

    @Test
    void returnsZeroForMinimumLengthWithEqualNumbers() {
        assertThat(solution.maxProductDifference(new int[] {1, 1, 1, 1})).isZero();
    }

    @Test
    void returnsTenForMinimumLengthSortedNumbers() {
        assertThat(solution.maxProductDifference(new int[] {1, 2, 3, 4})).isEqualTo(10);
    }

    @Test
    void ignoresOrderOfNumbers() {
        assertThat(solution.maxProductDifference(new int[] {4, 3, 2, 1})).isEqualTo(10);
        assertThat(solution.maxProductDifference(new int[] {7, 6, 5, 2, 4})).isEqualTo(34);
    }

    @Test
    void handlesDuplicatedMaximumAndMinimum() {
        assertThat(solution.maxProductDifference(new int[] {5, 1, 1, 9, 9})).isEqualTo(80);
    }

    @Test
    void returnsZeroForMaximumValuesOnly() {
        assertThat(solution.maxProductDifference(new int[] {10_000, 10_000, 10_000, 10_000}))
                .isZero();
    }

    @Test
    void handlesMaximumAndMinimumBoundsTogether() {
        assertThat(solution.maxProductDifference(new int[] {10_000, 10_000, 1, 1}))
                .isEqualTo(99_999_999);
    }

    @Test
    void handlesMaximumLength() {
        int[] nums = IntStream.rangeClosed(1, 10_000).toArray();

        assertThat(solution.maxProductDifference(nums)).isEqualTo(99_989_998);
    }
}