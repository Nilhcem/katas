package com.nilhcem.kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> getNumbersInRange(int from, int to) {
        List<String> result = new ArrayList<>(to - from + 1);

        for (int i = from; i <= to; i++) {
            result.add(getFormattedNumber(i));
        }
        return result;
    }

    public String getFormattedNumber(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
