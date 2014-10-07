package com.nilhcem.kata.coffee;

public enum InstructionType {

    TEA("T", 40, true),
    CHOCOLATE("H", 50, true),
    COFFEE("C", 60, true),
    ORANGE_JUICE("O", 60, false),
    MESSAGE("M", 0, false);

    private String instruction;
    private int costInCents;
    private boolean canBeExtraHot;

    private InstructionType(String instruction, int costInCents, boolean canBeExtraHot) {
        this.instruction = instruction;
        this.costInCents = costInCents;
        this.canBeExtraHot = canBeExtraHot;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getInstruction() {
        return instruction;
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
