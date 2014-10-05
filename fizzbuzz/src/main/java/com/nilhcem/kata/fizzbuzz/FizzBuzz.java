package com.nilhcem.kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> getNumbersInRange(int from, int to) {
        List<String> result = new ArrayList<>(to - from + 1);

        for (int i = from; i <= to; i++) {
            result.add(Integer.toString(i));
        }
        return result;
    }

    public String getFormattedNumber(int number) {
        return null;
    }
}
