package com.nilhcem.kata.fizzbuzz;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String convert(int number) {
        String result = "";

        if (number % 3 == 0) {
            result = FIZZ;
        }

        if (number % 5 == 0) {
            result += BUZZ;
        }

        if (result.isEmpty()) {
            result = Integer.toString(number);
        }
        return result;
    }
}
