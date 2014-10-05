package com.nilhcem.kata.fizzbuzz;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void should_return_numbers_in_a_given_range() {
        List<String> result = fizzbuzz.getNumbersInRange(0, 2);
        assertThat(result).containsExactly("0", "1", "2");
    }

    @Test
    public void should_return_fizz_when_number_is_multiple_of_three() {
        String result = fizzbuzz.getFormattedNumber(3);
        assertThat(result).isEqualTo("Fizz");
    }
}
