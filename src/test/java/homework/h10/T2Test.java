package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

    private final T2 solution = new T2();

    @Test
    void reversesOddLengthArrayForExample1() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        solution.reverseString(s);

        assertThat(s).containsExactly('o', 'l', 'l', 'e', 'h');
    }

    @Test
    void reversesEvenLengthArrayForExample2() {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};

        solution.reverseString(s);

        assertThat(s).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
    }

    @Test
    void keepsSingleElementUnchanged() {
        char[] s = {'a'};

        solution.reverseString(s);

        assertThat(s).containsExactly('a');
    }

    @Test
    void swapsTwoElements() {
        char[] s = {'a', 'b'};

        solution.reverseString(s);

        assertThat(s).containsExactly('b', 'a');
    }

    @Test
    void keepsPalindromeUnchanged() {
        char[] s = {'a', 'b', 'c', 'b', 'a'};

        solution.reverseString(s);

        assertThat(s).containsExactly('a', 'b', 'c', 'b', 'a');
    }

    @Test
    void keepsMiddleElementInPlaceForOddLength() {
        char[] s = {'1', '2', '3'};

        solution.reverseString(s);

        assertThat(s).containsExactly('3', '2', '1');
    }

    @Test
    void reversesSpacesAndPunctuation() {
        char[] s = {' ', 'a', '!', '~'};

        solution.reverseString(s);

        assertThat(s).containsExactly('~', '!', 'a', ' ');
    }

    @Test
    void returningToOriginalAfterTwoReversals() {
        char[] s = {'x', 'y', 'z', 'w'};

        solution.reverseString(s);
        solution.reverseString(s);

        assertThat(s).containsExactly('x', 'y', 'z', 'w');
    }

    @Test
    void reversesMaximumLengthArray() {
        char[] s = new char[100_000];
        for (int i = 0; i < s.length; i++) {
            s[i] = (char) ('a' + i % 26);
        }
        char[] expected = new StringBuilder(new String(s)).reverse().toString().toCharArray();

        solution.reverseString(s);

        assertThat(s).containsExactly(expected);
    }
}