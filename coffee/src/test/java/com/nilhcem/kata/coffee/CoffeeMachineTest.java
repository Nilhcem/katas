package com.nilhcem.kata.coffee;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CoffeeMachineTest {

    @Spy
    private CoffeeMachine coffeeMachine = new CoffeeMachine();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void should_return_null_when_instruction_type_is_invalid() {
        assertThat(coffeeMachine.enterInstructions("Z:0:0")).isNull();
        verify(coffeeMachine).displayMessage(true, "Invalid instruction type");
    }

    @Test
    public void should_forward_message_to_the_coffee_machine_when_giving_valid_instructions_M() {
        // Given
        String instructions = "M:hello";

        // When
        DrinkOrder drinkOrder = coffeeMachine.enterInstructions(instructions);

        // Then
        assertThat(drinkOrder).isNull();
        verify(coffeeMachine).displayMessage(false, "hello");
    }

    @Test
    public void should_make_a_drink_when_giving_enough_money() {
        coffeeMachine.enterMoney(100);
        DrinkOrder order = coffeeMachine.enterInstructions("T:1:0");
        assertThat(order).isNotNull();
        verify(coffeeMachine, times(0)).displayMessage(anyBoolean(), anyString());
    }

    @Test
    public void should_not_make_a_drink_and_display_required_left_amount_when_not_giving_enough_money() {
        coffeeMachine.enterMoney(10);
        DrinkOrder order = coffeeMachine.enterInstructions("T:1:0");
        assertThat(order).isNull();
        verify(coffeeMachine).displayMessage(true, "Missing: 30 cents");
    }

    @Test
    public void should_display_report_when_giving_valid_instructions_M_reporting() {
        // Given
        coffeeMachine.enterMoney(40);
        coffeeMachine.enterInstructions("T:1:0");
        coffeeMachine.enterMoney(40);
        coffeeMachine.enterInstructions("T:1:0");

        // When
        coffeeMachine.enterInstructions("M:reporting");

        // Then
        String separator = System.lineSeparator();
        verify(coffeeMachine).displayMessage(false, "Drinks sold:" + separator + "TEA: 2" + separator +
                "CHOCOLATE: 0" + separator + "COFFEE: 0" + separator + "ORANGE_JUICE: 0" + separator +
                "Money earned: 80");
    }
}
