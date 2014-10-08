package com.nilhcem.kata.coffee;

public class Reporting {

    private int nbSoldDrinks;
    private int nbMoneyEarnedInCents;

    public void addDrink(int cents) {
        nbSoldDrinks += 1;
        nbMoneyEarnedInCents += cents;
    }

    public int getNbSoldDrinks() {
        return nbSoldDrinks;
    }

    public int getNbMoneyEarnedInCents() {
        return nbMoneyEarnedInCents;
    }

    @Override
    public String toString() {
        return String.format("Nb drinks sold: %d - Money earned: %d", nbSoldDrinks, nbMoneyEarnedInCents);
    }
}
