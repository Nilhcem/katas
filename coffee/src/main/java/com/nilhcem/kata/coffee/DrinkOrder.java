package com.nilhcem.kata.coffee;

public class DrinkOrder {

    private InstructionType type;
    private int nbSugars;

    public DrinkOrder(InstructionType type, int nbSugars) {
        this.type = type;
        this.nbSugars = nbSugars;
    }

    public InstructionType getInstructionType() {
        return type;
    }

    public int getNbSugar() {
        return nbSugars;
    }

    public boolean hasStick() {
        return false;
    }
}
