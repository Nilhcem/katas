package com.nilhcem.kata.coffee;

public class App {

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.enterInstructions("M:Hello!");

        machine.enterMoney(40);
        machine.enterInstructions("T:1:0");
        machine.enterMoney(60);
        machine.enterInstructions("O:0:0");

        machine.enterInstructions("M:reporting");
    }
}
