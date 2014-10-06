package com.nilhcem.kata.coffee;

public class DrinkMaker {

    private static final String INSTRUCTIONS_SEPARATOR = ":";

    private CoffeeMachine coffeeMachine;

    public DrinkMaker(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public DrinkOrder parseInstruction(String instruction) {
        DrinkOrder order = null;

        String[] splitted = instruction.split(INSTRUCTIONS_SEPARATOR);
        if (splitted.length < 1) {
            coffeeMachine.printMessage(true, "Invalid instruction");
            return null;
        }

        InstructionType type = InstructionType.getFromInstruction(splitted[0]);
        if (type == null) {
            coffeeMachine.printMessage(true, "Invalid instruction type");
            return null;
        }

        if (InstructionType.MESSAGE.equals(type)) {
            String message = "";
            if (splitted.length > 1) {
                message = splitted[1];
            }
            coffeeMachine.printMessage(false, message);
        } else {
            Integer nbSugars = getNbSugarsFromInstruction(splitted.length > 2 ? splitted[1] : null);
            if (nbSugars == null) {
                coffeeMachine.printMessage(true, "Invalid number of sugars. Please select 0, 1 or 2");
                return null;
            }
            order = new DrinkOrder(type, nbSugars, nbSugars > 0);
        }
        return order;
    }

    private Integer getNbSugarsFromInstruction(String instruction) {
        Integer nbSugars = null;

        if (instruction == null || instruction.isEmpty()) {
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
