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
        String result = "";

        if (number % 3 == 0) {
            result += "Fizz";
        }

        if (number % 5 == 0) {
            result += "Buzz";
        }

        if (result.isEmpty()) {
            result = Integer.toString(number);
        }
        return result;
    }
}
