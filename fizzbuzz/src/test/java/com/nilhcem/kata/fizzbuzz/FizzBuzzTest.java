package com.nilhcem.kata.fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_number_to_string_when_not_multiple_of_three_and_five() {
        String result = FizzBuzz.convert(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void should_return_Fizz_when_number_is_multiple_of_three() {
        String result1 = FizzBuzz.convert(3);
        String result2 = FizzBuzz.convert(12);

        assertThat(result1).isEqualTo(result2).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_when_number_is_multiple_of_five() {
        String result1 = FizzBuzz.convert(5);
        String result2 = FizzBuzz.convert(10);

        assertThat(result1).isEqualTo(result2).isEqualTo("Buzz");
    }

    @Test
    public void should_return_FizzBuzz_when_number_is_both_multiple_of_three_and_five() {
        String result = FizzBuzz.convert(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
