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

        Integer nbSugars = getNbSugarsFromInstruction(splitted[1]);
        if (nbSugars == null) {
            System.err.println("Nb sugars is invalid");
            return null;
        }

        return new DrinkOrder(type, nbSugars, nbSugars > 0);
    }

    private Integer getNbSugarsFromInstruction(String instruction) {
        Integer nbSugars = null;

        if (instruction.isEmpty()) {
            nbSugars = 0;
        } else if (instruction.matches("[0-9]+")) {
            try {
                nbSugars = Integer.parseInt(instruction);
                if (nbSugars < 0 || nbSugars > 2) {
                    System.err.println("Can only have [0-2] sugars. Here: " + instruction);
                    nbSugars = null;
                }
            } catch (NumberFormatException e) {
                System.err.println("Cannot parse int: " + instruction);
            }
        }
        return nbSugars;
    }
}
