package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class T1Test {

    private static final double PRECISION = 1e-5;

    private final T1 solution = new T1();

    @Test
    void returnsTwoThousandFiveHundredForExample1() {
        assertThat(solution.averageSalary(new int[] {4000, 3000, 1000, 2000}))
                .isEqualTo(2500.0, within(PRECISION));
    }

    @Test
    void returnsTwoThousandForExample2() {
        assertThat(solution.averageSalary(new int[] {1000, 2000, 3000}))
                .isEqualTo(2000.0, within(PRECISION));
    }

    @Test
    void returnsMiddleSalaryForMinimumLength() {
        assertThat(solution.averageSalary(new int[] {1000, 5000, 9000}))
                .isEqualTo(5000.0, within(PRECISION));
    }

    @Test
    void ignoresOrderOfSalaries() {
        assertThat(solution.averageSalary(new int[] {3000, 1000, 4000, 2000}))
                .isEqualTo(2500.0, within(PRECISION));