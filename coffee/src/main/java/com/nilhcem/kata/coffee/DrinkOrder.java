package com.nilhcem.kata.coffee;

public class DrinkOrder {

    private InstructionType type;
    private int nbSugars;
    private boolean hasStick;

    public DrinkOrder(InstructionType type, int nbSugars, boolean hasStick) {
        this.type = type;
        this.nbSugars = nbSugars;
        this.hasStick = hasStick;
    }

    public InstructionType getInstructionType() {
        return type;
    }

    public int getNbSugar() {
        return nbSugars;
    }

    public boolean hasStick() {
        return hasStick;
    }
}
