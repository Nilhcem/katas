package com.nilhcem.kata.coffee;

public class CoffeeMachine {

    public static final String INSTRUCTIONS_SEPARATOR = ":";

    private int centsInMachine;
    private DrinkMaker drinkMaker = new DrinkMaker(this);

    public void displayMessage(boolean error, String message) {
        if (error) {
            System.err.println(message);
        } else {
            System.out.println(message);
        }
    }

    public void enterMoney(int cents) {
        centsInMachine = cents;
    }

    public DrinkOrder makeDrink(String instructions) {
        DrinkOrder order = null;

        InstructionType type = InstructionType.getFromInstruction(instructions);
        if (type == null) {
            displayMessage(true, "Invalid instruction type");
        } else {
            if (InstructionType.MESSAGE.equals(type)) {
                handleMessageInstruction(instructions);
            } else {
                if (handleMoneyCheck(type)) {
                    order = drinkMaker.makeDrink(type, instructions);
                }
            }
        }
        return order;
    }

    private void handleMessageInstruction(String instructions) {
        String[] splitted = instructions.split(INSTRUCTIONS_SEPARATOR);
        String message = "";
        if (splitted.length > 1) {
            message = splitted[1];
        }
        displayMessage(false, message);
    }

    private boolean handleMoneyCheck(InstructionType type) {
        boolean success = false;

        int cost = type.getCostInCents();
        if (centsInMachine >= cost) {
            success = true;
        } else {
            displayMessage(true, String.format("Missing: %d cents", cost - centsInMachine));
        }
        return success;
    }
}
