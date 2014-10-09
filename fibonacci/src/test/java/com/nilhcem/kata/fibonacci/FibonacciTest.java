package com.nilhcem.kata.fibonacci;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FibonacciTest {

    @Test
    @Parameters({"0, 1", "1, 1", "2, 2", "3, 3", "4, 5", "5, 8", "6, 13", "7, 21", "8, 34"})
    public void should_get_fibonacci_of(final int idx, final int expectedResult) {
        assertThat(Fibonacci.of(idx)).isEqualTo(expectedResult);
    }

    @Test
    public void should_generate_fibonacci_sequence() {
        List<Integer> sequence = Fibonacci.getSequence(7);
        assertThat(sequence).containsExactly(1, 1, 2, 3, 5, 8, 13);
    }
}
