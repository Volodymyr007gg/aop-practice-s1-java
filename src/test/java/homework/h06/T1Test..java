package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

    private final T1 solution = new T1();

    @Test
    void returnsTrueForExample1() {
        assertThat(solution.isAnagram("anagram", "nagaram")).isTrue();
    }

    @Test
    void returnsFalseForExample2() {
        assertThat(solution.isAnagram("rat", "car")).isFalse();
    }

    @Test
    void returnsTrueForSingleSameLetter() {
        assertThat(solution.isAnagram("a", "a")).isTrue();
    }

    @Test
    void returnsFalseForSingleDifferentLetters() {
        assertThat(solution.isAnagram("a", "b")).isFalse();
    }

    @Test
    void returnsTrueForIdenticalStrings() {
        assertThat(solution.isAnagram("abc", "abc")).isTrue();
    }

    @Test
    void returnsTrueForReversedString() {
        assertThat(solution.isAnagram("listen", "silent")).isTrue();
    }

    @Test
    void returnsFalseWhenSecondStringIsLonger() {
        assertThat(solution.isAnagram("ab", "abc")).isFalse();
    }

    @Test
    void returnsFalseWhenFirstStringIsLonger() {
        assertThat(solution.isAnagram("abc", "ab")).isFalse();
    }

    @Test
    void returnsFalseWhenLettersHaveDifferentCounts() {
        assertThat(solution.isAnagram("aab",
}
