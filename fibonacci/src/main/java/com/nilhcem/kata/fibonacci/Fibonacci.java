package com.nilhcem.kata.fibonacci;

public class Fibonacci {

    private Fibonacci() {
        throw new IllegalArgumentException();
    }

    public static int of(int i) {
        if (i <= 1) {
            return 1;
        }
        return Fibonacci.of(i - 2) + Fibonacci.of(i - 1);
    }
}
