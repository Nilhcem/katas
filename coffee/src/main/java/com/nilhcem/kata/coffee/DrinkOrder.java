package com.nilhcem.kata.coffee;

public class DrinkOrder {

    private InstructionType type;

    public DrinkOrder(InstructionType type) {
        this.type = type;
    }

    public InstructionType getInstructionType() {
        return type;
    }

    public int getNbSugar() {
        return 0;
    }

    public boolean hasStick() {
        return false;
    }
}
