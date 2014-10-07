package com.nilhcem.kata.coffee;

import static com.nilhcem.kata.coffee.CoffeeMachine.INSTRUCTIONS_SEPARATOR;

public class DrinkMaker {

    private CoffeeMachine coffeeMachine;

    public DrinkMaker(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public DrinkOrder makeDrink(InstructionType type, String instruction) {
        String[] splitted = instruction.split(INSTRUCTIONS_SEPARATOR);
        Integer nbSugars = getNbSugarsFromInstruction(splitted.length > 2 ? splitted[1] : null);
        if (nbSugars == null) {
            coffeeMachine.displayMessage(true, "Invalid number of sugars. Please select 0, 1 or 2");
            return null;
        }
        return new DrinkOrder(type, nbSugars, nbSugars > 0);
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
