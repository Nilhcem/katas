package com.nilhcem.kata.coffee;

public enum InstructionType {

    TEA("T", 40, true, true),
    CHOCOLATE("H", 50, true, true),
    COFFEE("C", 60, true, true),
    ORANGE_JUICE("O", 60, true, false),
    MESSAGE("M", 0, false, false);

    private String instruction;
    private int costInCents;
    private boolean isDrink;
    private boolean canBeExtraHot;

    private InstructionType(String instruction, int costInCents, boolean isDrink, boolean canBeExtraHot) {
        this.instruction = instruction;
        this.costInCents = costInCents;
        this.isDrink = isDrink;
        this.canBeExtraHot = canBeExtraHot;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getInstruction() {
        return instruction;
    }

    public boolean isDrink() {
        return isDrink;
    }

    public boolean canBeExtraHot() {
        return canBeExtraHot;
    }

    public static InstructionType getFromInstruction(String instruction) {
        String requestedInstruction = null;
        if (instruction != null && !instruction.isEmpty()) {
            requestedInstruction = instruction.substring(0, 1).toUpperCase();
        }

        for (InstructionType type : InstructionType.values()) {
            if (requestedInstruction.equals(type.getInstruction())) {
                return type;
            }
        }
        return null;
    }
}
