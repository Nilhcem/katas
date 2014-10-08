package com.nilhcem.kata.coffee;

import java.util.HashMap;
import java.util.Map;

public class Reporting {

    private Map<InstructionType, Integer> nbSoldDrinks = new HashMap<>();

    public void addDrink(InstructionType drink) {
        nbSoldDrinks.put(drink, getNbSoldDrink(drink) + 1);
    }

    public int getNbSoldDrink(InstructionType drink) {
        Integer counter = nbSoldDrinks.get(drink);
        if (counter == null) {
            counter = 0;
        }
        return counter;
    }

    public int getNbSoldDrinks() {
        int counter = 0;
        for (Map.Entry<InstructionType, Integer> entry : nbSoldDrinks.entrySet()) {
            counter += entry.getValue();
        }
        return counter;
    }

    public int getNbMoneyEarnedInCents() {
        int total = 0;
        for (Map.Entry<InstructionType, Integer> entry : nbSoldDrinks.entrySet()) {
            total += entry.getValue() * entry.getKey().getCostInCents();
        }
        return total;
    }

    @Override
    public String toString() {
        String separator = System.lineSeparator();

        StringBuilder sb = new StringBuilder("Drinks sold:").append(separator);
        for (InstructionType type : InstructionType.values()) {
            if (type.isDrink()) {
                sb.append(type.name()).append(": ").append(getNbSoldDrink(type)).append(separator);
            }
        }
        sb.append("Money earned: ").append(getNbMoneyEarnedInCents());
        return sb.toString();
    }
}
