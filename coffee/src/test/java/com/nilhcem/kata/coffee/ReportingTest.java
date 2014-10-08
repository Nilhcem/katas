package com.nilhcem.kata.coffee;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReportingTest {

    private Reporting reporting = new Reporting();

    @Test
    public void should_report_nb_each_sold_drinks_and_total_amount_of_money_earned() {
        reporting.addDrink(InstructionType.TEA);
        reporting.addDrink(InstructionType.CHOCOLATE);
        reporting.addDrink(InstructionType.ORANGE_JUICE);
        reporting.addDrink(InstructionType.ORANGE_JUICE);

        assertThat(reporting.getNbSoldDrink(InstructionType.TEA)).isEqualTo(1);
        assertThat(reporting.getNbSoldDrink(InstructionType.CHOCOLATE)).isEqualTo(1);
        assertThat(reporting.getNbSoldDrink(InstructionType.COFFEE)).isEqualTo(0);
        assertThat(reporting.getNbSoldDrink(InstructionType.ORANGE_JUICE)).isEqualTo(2);
        assertThat(reporting.getNbSoldDrinks()).isEqualTo(4);
        assertThat(reporting.getNbMoneyEarnedInCents()).isEqualTo(210);
    }
}
