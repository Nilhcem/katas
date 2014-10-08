package com.nilhcem.kata.coffee;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReportingTest {

    private Reporting reporting = new Reporting();

    @Test
    public void should_report_nb_sold_drinks_and_total_amount_of_money_earned() {
        reporting.addDrink(30);
        reporting.addDrink(40);
        reporting.addDrink(20);
        reporting.addDrink(42);

        assertThat(reporting.getNbSoldDrinks()).isEqualTo(4);
        assertThat(reporting.getNbMoneyEarnedInCents()).isEqualTo(132);
    }
}
