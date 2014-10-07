package com.nilhcem.kata.coffee;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class DrinkMakerTest {

    private DrinkMaker drinkMaker;

    @Spy
    private CoffeeMachine coffeeMachine = new CoffeeMachine();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        drinkMaker = new DrinkMaker(coffeeMachine);
    }

    @Test
    public void should_return_null_when_giving_other_than_zero_one_or_two_sugars() {
        assertThat(drinkMaker.makeDrink(InstructionType.TEA, "T:3:0")).isNull();
        assertThat(drinkMaker.makeDrink(InstructionType.TEA, "T:-1:0")).isNull();
        verify(coffeeMachine, times(2)).displayMessage(true, "Invalid number of sugars. Please select 0, 1 or 2");
    }

    @Test
    public void should_create_order_when_giving_valid_instructions_T_1_0() {
        // Given
        String instructions = "T:1:0";

        // When
        DrinkOrder order = drinkMaker.makeDrink(InstructionType.TEA, instructions);

        // Then
        assertThat(order.getInstructionType()).isEqualTo(InstructionType.TEA);
        assertThat(order.getNbSugar()).isEqualTo(1);
        assertThat(order.hasStick()).isTrue();
    }

    @Test
    public void should_create_order_when_giving_valid_instruction_H__() {
        // Given
        String instructions = "H::";

        // When
        DrinkOrder order = drinkMaker.makeDrink(InstructionType.CHOCOLATE, instructions);

        // Then
        assertThat(order.getInstructionType()).isEqualTo(InstructionType.CHOCOLATE);
        assertThat(order.getNbSugar()).isEqualTo(0);
        assertThat(order.hasStick()).isFalse();
    }

    @Test
    public void should_create_order_when_giving_valid_instructions_C_2_0() {
        // Given
        String instructions = "C:2:0";

        // When
        DrinkOrder order = drinkMaker.makeDrink(InstructionType.COFFEE, instructions);

        // Then
        assertThat(order.getInstructionType()).isEqualTo(InstructionType.COFFEE);
        assertThat(order.getNbSugar()).isEqualTo(2);
        assertThat(order.hasStick()).isTrue();
    }

    @Test
    public void should_handle_extra_hot_drinks_when_giving_h_instruction() {
        // Given
        String instructions = "Hh:1:0";

        // When
        DrinkOrder order = drinkMaker.makeDrink(InstructionType.CHOCOLATE, instructions);

        // Then
        assertThat(order.getInstructionType()).isEqualTo(InstructionType.CHOCOLATE);
        assertThat(order.getNbSugar()).isEqualTo(1);
        assertThat(order.hasStick()).isTrue();
        assertThat(order.isExtraHot()).isTrue();
    }

    @Test
    public void should_never_handle_extra_hot_argument_for_orange_juice() {
        // Given
        String instructions = "Oh::";

        // When
        DrinkOrder order = drinkMaker.makeDrink(InstructionType.ORANGE_JUICE, instructions);

        // Then
        assertThat(order.getInstructionType()).isEqualTo(InstructionType.ORANGE_JUICE);
        assertThat(order.getNbSugar()).isEqualTo(0);
        assertThat(order.hasStick()).isFalse();
        assertThat(order.isExtraHot()).isFalse();
    }
}
