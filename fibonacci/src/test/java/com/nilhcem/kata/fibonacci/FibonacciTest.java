package com.nilhcem.kata.fibonacci;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    @Test
    public void fibonacci_of_0_is_1() {
        assertThat(Fibonacci.of(0)).isEqualTo(1);
    }

    @Test
    public void fibonacci_of_1_is_1() {
        assertThat(Fibonacci.of(1)).isEqualTo(1);
    }

    @Test
    public void fibonacci_of_2_is_2() {
        assertThat(Fibonacci.of(2)).isEqualTo(2);
    }

    @Test
    public void fibonacci_of_3_is_3() {
        assertThat(Fibonacci.of(3)).isEqualTo(3);
    }

    @Test
    public void fibonacci_of_4_is_5() {
        assertThat(Fibonacci.of(4)).isEqualTo(5);
    }

    @Test
    public void fibonacci_of_5_is_8() {
        assertThat(Fibonacci.of(5)).isEqualTo(8);
    }

    @Test
    public void fibonacci_of_6_is_13() {
        assertThat(Fibonacci.of(6)).isEqualTo(13);
    }

    @Test
    public void should_generate_fibonacci_sequence() {
        List<Integer> sequence = Fibonacci.getSequence(7);
        assertThat(sequence).containsExactly(1, 1, 2, 3, 5, 8, 13);
    }
}
