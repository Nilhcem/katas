package com.nilhcem.kata.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void should_return_numbers_in_a_given_range() {
        List<String> result = fizzbuzz.getNumbersInRange(0, 2);
        Assertions.assertThat(result).containsExactly("0", "1", "2");
    }
}
