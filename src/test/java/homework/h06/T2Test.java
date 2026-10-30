package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

    private final T2 solution = new T2();

    @Test
    void returnsTrueForExample1() {
        assertThat(solution.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }

    @Test
    void returnsFalseForExample2() {
        assertThat(solution.isPalindrome("race a car")).isFalse();
    }

    @Test
    void returnsTrueForExample3() {
        assertThat(solution.isPalindrome(" ")).isTrue();
    }

    @Test
    void returnsTrueForSingleLetter() {
        assertThat(solution.isPalindrome("a")).isTrue();
    }

    @Test
    void returnsTrueForOnlyNonAlphanumericCharacters() {
        assertThat(solution.isPalindrome(".,!?")).isTrue();
    }

    @Test
    void returnsTrueForEvenLengthPalindrome() {
        assertThat(solution.isPalindrome("abba")).isTrue();
    }

    @Test
    void returnsTrueForOddLengthPalindrome() {
        assertThat(solution.isPalindrome("aba")).isTrue();
    }

    @Test
    void returnsFalseForTwoDifferentLetters() {
        assertThat(solution.isPalindrome("ab")).isFalse();
    }

    @Test
    void ignoresCase() {
        assertThat(solution.isPalindrome("Aa")).isTrue();
    }

    @Test
    void ignoresPunctuationInsideString() {
        assertThat(solution.isPalindrome("a.b,a")).isTrue();
    }

    @Test
    void ignoresNonAlphanumericCharactersAtEnds() {
        assertThat(solution.isPalindrome("!a!")).isTrue();
    }

    @Test
    void returnsTrueForDigitsPalindrome() {
        assertThat(solution.isPalindrome("12321")).isTrue();
    }

    @Test
    void treatsDigitsAndLettersAsDifferentCharacters() {
        assertThat(solution.isPalindrome("0P")).isFalse();
    }

    @Test
    void returnsTrueForMaximumLengthPalindrome() {
        assertThat(solution.isPalindrome("a".repeat(200_000))).isTrue();
    }

    @Test
    void returnsFalseForMaximumLengthWithOffCenterLetter() {
        String s = "a".repeat(100_000) + "b" + "a".repeat(99_999);

        assertThat(solution.isPalindrome(s)).isFalse();
    }
}