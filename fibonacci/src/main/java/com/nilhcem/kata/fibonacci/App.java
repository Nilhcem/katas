package com.nilhcem.kata.fibonacci;

import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = Fibonacci.getSequence(10);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
