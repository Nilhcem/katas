package com.nilhcem.kata.coffee;

public class CoffeeMachine {

    public void displayMessage(boolean error, String message) {
        if (error) {
            System.err.println(message);
        } else {
            System.out.println(message);
        }
    }
}
