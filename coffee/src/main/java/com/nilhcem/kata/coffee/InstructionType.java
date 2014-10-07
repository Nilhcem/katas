package com.nilhcem.kata.coffee;

public enum InstructionType {

    TEA("T", 40),
    CHOCOLATE("H", 50),
    COFFEE("C", 60),
    MESSAGE("M", 0);

    private String instruction;
    private int costInCents;

    private InstructionType(String instruction, int costInCents) {
        this.instruction = instruction;
        this.costInCents = costInCents;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getInstruction() {
        return instruction;
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
