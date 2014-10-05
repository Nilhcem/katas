package com.nilhcem.kata.fizzbuzz;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void should_return_string_numbers_in_a_given_range() {
        List<String> result = fizzbuzz.getNumbersInRange(1, 2);
        assertThat(result).containsExactly("1", "2");
    }

    @Test
    public void should_return_fizz_when_number_is_multiple_of_three() {
        String result = fizzbuzz.getFormattedNumber(3);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void should_return_buzz_when_number_is_multiple_of_five() {
        String result = fizzbuzz.getFormattedNumber(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void should_return_fizzbuzz_when_number_is_both_multiple_of_three_and_five() {
        String result = fizzbuzz.getFormattedNumber(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
