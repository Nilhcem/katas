package com.nilhcem.kata.coffee;

public class DrinkOrder {

    private InstructionType type;
    private int nbSugars;
    private boolean hasStick;
    private boolean extraHot;

    public DrinkOrder(InstructionType type, int nbSugars, boolean hasStick, boolean extraHot) {
        this.type = type;
        this.nbSugars = nbSugars;
        this.hasStick = hasStick;
        this.extraHot = extraHot;
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

    public boolean isExtraHot() {
        return extraHot;
    }
}
