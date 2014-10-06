package com.nilhcem.kata.coffee;

public enum InstructionType {

    TEA("T"),
    CHOCOLATE("H"),
    COFFEE("C"),
    MESSAGE("M");

    private String instruction;

    private InstructionType(String instruction) {
        this.instruction = instruction;
    }

    public String getInstruction() {
        return instruction;
    }

    public static InstructionType getFromInstruction(String instruction) {
        for (InstructionType type : InstructionType.values()) {
            if (instruction.equals(type.getInstruction())) {
                return type;
            }
        }
        return null;
    }
}
