package com.nilhcem.kata.coffee;

public class DrinkMaker {

    private static final String INSTRUCTIONS_SEPARATOR = ":";

    public DrinkOrder parseInstruction(String instruction) {
        String[] splitted = instruction.split(INSTRUCTIONS_SEPARATOR);
        if (splitted.length != 3) {
            System.err.println("Instruction size is invalid");
            return null;
        }

        InstructionType type = InstructionType.getFromInstruction(splitted[0]);
        if (type == null) {
            System.err.println("Instruction type is invalid");
            return null;
        }

        return new DrinkOrder(type);
    }

    private InstructionType getInstructionTypeFrom(String instruction) {
        return null;
    }
}
