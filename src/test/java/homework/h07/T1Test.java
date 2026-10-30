package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

    private final T1 solution = new T1();

    @Test
    void returnsFizzAtEndForExample1() {
        assertThat(solution.fizzBuzz(3)).containsExactly("1", "2", "Fizz");
    }

    @Test
    void returnsBuzzAtEndForExample2() {
        assertThat(solution.fizzBuzz(5)).containsExactly("1", "2", "Fizz", "4", "Buzz");
    }

    @Test
    void returnsFizzBuzzAtEndForExample3() {
        assertThat(solution.fizzBuzz(15))
                .containsExactly(
                        "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                        "14", "FizzBuzz");
    }

    @Test
    void returnsSingleNumberForMinimumValue() {
        assertThat(solution.fizzBuzz(1)).containsExactly("1");
    }

    @Test
    void returnsOnlyNumbersForTwo() {
        assertThat(solution.fizzBuzz(2)).containsExactly("1", "2");
    }

    @Test
    void returnsFizzBuzzForNextMultipleOfFifteen() {
        assertThat(solution.fizzBuzz(30).get(29)).isEqualTo("FizzBuzz");
    }

    @Test
    void returnsFizzBuzzOnlyForMultiplesOfFifteen() {
        assertThat(solution.fizzBuzz(30)).containsOnlyOnce("FizzBuzz", "FizzBuzz").hasSize(30);
    }

    @Test
    void returnsListWithSizeEqualToN() {
        assertThat(solution.fizzBuzz(10_000)).hasSize(10_000);
    }

    @Test
    void returnsFizzForMaximumValueMinusOne() {
        assertThat(solution.fizzBuzz(10_000).get(9_998)).isEqualTo("Fizz");
    }

    @Test
    void returnsBuzzForMaximumValue() {
        assertThat(solution.fizzBuzz(10_000).get(9_999)).isEqualTo("Buzz");
    }
}