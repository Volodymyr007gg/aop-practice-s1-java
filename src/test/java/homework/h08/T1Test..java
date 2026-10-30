package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T1Test {

    private final T1 solution = new T1();

    @Test
    void returnsThreeForExample1() {
        assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1})).isEqualTo(3);
    }

    @Test
    void returnsTwoForExample2() {
        assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1})).isEqualTo(2);
    }

    @Test
    void returnsZeroForSingleZero() {
        assertThat(solution.findMaxConsecutiveOnes(new int[] {0})).isZero();
    }

    @Test
    void returnsOneForSingleOne() {
        assertThat(solution.findMaxConsecutiveOnes(new int[] {1})).isEqualTo(1);
    }

    @Test
    void returnsLengthForAllOnes() {
        assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 1, 1, 1})).isEqualTo(4);
    }

    @Test
    void returnsZeroForAllZeros() {
        assertThat(solution.findMaxConsecutiveOnes(new int[] {0, 0, 0})).isZero();
    }

    @Test
    void returnsLongestSequenceAtStart() {
        assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 1, 1, 0, 1})).isEqualTo(3);
    }

    @Test
    void returnsLongestSequenceAtEnd() {
        assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 1})).isEqualTo(3);
    }

    @Test
    void keepsMaximumWhenLaterSequenceIsShorter() {
        assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 1, 1, 0, 1, 1})).isEqualTo(3);
    }

    @Test
    void returnsMaximumLengthForAllOnes() {
        int[] nums = new int[100_000];
        Arrays.fill(nums, 1);

        assertThat(solution.findMaxConsecutiveOnes(nums)).isEqualTo(100_000);
    }

    @Test
    void returnsZeroForMaximumLengthOfZeros() {
        assertThat(solution.findMaxConsecutiveOnes(new int[100_000])).isZero();
    }

    @Test
    void returnsLongerHalfForMaximumLengthWithZeroInTheMiddle() {
        int[] nums = new int[100_000];
        Arrays.fill(nums, 1);
        nums[50_000] = 0;

        assertThat(solution.findMaxConsecutiveOnes(nums)).isEqualTo(50_000);
    }
}