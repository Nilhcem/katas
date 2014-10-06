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
}
