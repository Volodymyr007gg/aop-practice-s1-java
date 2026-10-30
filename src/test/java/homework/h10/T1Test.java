package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

    private final T1 solution = new T1();

    @Test
    void returnsBForExample1() {
        assertThat(solution.kthCharacter(5)).isEqualTo('b');
    }

    @Test
    void returnsCForExample2() {
        assertThat(solution.kthCharacter(10)).isEqualTo('c');
    }

    @Test
    void returnsAForMinimumValue() {
        assertThat(solution.kthCharacter(1)).isEqualTo('a');
    }

    @Test
    void returnsBForSecondCharacter() {
        assertThat(solution.kthCharacter(2)).isEqualTo('b');
    }

    @Test
    void returnsBForThirdCharacter() {
        assertThat(solution.kthCharacter(3)).isEqualTo('b');
    }

    @Test
    void returnsCForFourthCharacter() {
        assertThat(solution.kthCharacter(4)).isEqualTo('c');
    }

    @Test
    void returnsDForEighthCharacter() {
        assertThat(solution.kthCharacter(8)).isEqualTo('d');
    }

    @Test
    void returnsBForFirstCharacterOfSecondHalf() {
        assertThat(solution.kthCharacter(9)).isEqualTo('b');
    }

    @Test
    void returnsEForLastCharacterOfFourthWord() {
        assertThat(solution.kthCharacter(16)).isEqualTo('e');
    }

    @Test
    void returnsIForPowerOfTwoBoundary() {
        assertThat(solution.kthCharacter(256)).isEqualTo('i');
    }

    @Test
    void returnsBAfterPowerOfTwoBoundary() {
        assertThat(solution.kthCharacter(257)).isEqualTo('b');
    }

    @Test
    void returnsHForMaximumValue() {
        assertThat(solution.kthCharacter(500)).isEqualTo('h');
    }
}
