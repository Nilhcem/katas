package com.nilhcem.kata.fibonacci;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Integer> getSequence(int nbElements) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nbElements; i++) {
            list.add(Fibonacci.of(i));
        }
        return list;
    }
}
