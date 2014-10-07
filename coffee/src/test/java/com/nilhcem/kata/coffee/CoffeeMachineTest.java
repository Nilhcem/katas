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
        assertThat(coffeeMachine.makeDrink("Z:0:0")).isNull();
        verify(coffeeMachine).displayMessage(true, "Invalid instruction type");
    }

    @Test
    public void should_forward_message_to_the_coffee_machine_when_giving_valid_instructions_M() {
        // Given
        String instructions = "M:hello";

        // When
        DrinkOrder drinkOrder = coffeeMachine.makeDrink(instructions);

        // Then
        assertThat(drinkOrder).isNull();
        verify(coffeeMachine).displayMessage(false, "hello");
    }

    @Test
    public void should_make_a_drink_when_giving_enough_money() {
        coffeeMachine.enterMoney(100);
        DrinkOrder order = coffeeMachine.makeDrink("T:1:0");
        assertThat(order).isNotNull();
        verify(coffeeMachine, times(0)).displayMessage(anyBoolean(), anyString());
    }
}
