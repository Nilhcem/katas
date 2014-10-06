package com.nilhcem.kata.coffee;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrinkMakerTest {

    CoffeeMachine coffeeMachine = new CoffeeMachine();
    DrinkMaker drinkMaker = new DrinkMaker(coffeeMachine);

    @Test
    public void should_return_null_when_instruction_size_is_invalid() {
        assertThat(drinkMaker.parseInstruction("OMG")).isNull();
    }

    @Test
    public void should_return_null_when_instruction_type_is_invalid() {
        assertThat(drinkMaker.parseInstruction("Z:0:0")).isNull();
    }

    @Test
    public void should_return_null_when_giving_other_than_zero_one_or_two_sugars() {
        assertThat(drinkMaker.parseInstruction("T:3:0")).isNull();
        assertThat(drinkMaker.parseInstruction("T:-1:0")).isNull();
    }

    @Test
    public void should_create_order_when_giving_valid_instructions_T_1_0() {
        // Given
        String instruction = "T:1:0";

        // When
        DrinkOrder order = drinkMaker.parseInstruction(instruction);

        // Then
        assertThat(order.getInstructionType()).isEqualTo(InstructionType.TEA);
        assertThat(order.getNbSugar()).isEqualTo(1);
        assertThat(order.hasStick()).isTrue();
    }

    @Test
    public void should_create_order_when_giving_valid_instruction_H__() {
        // Given
        String instruction = "H::";

        // When
        DrinkOrder order = drinkMaker.parseInstruction(instruction);

        // Then
        assertThat(order.getInstructionType()).isEqualTo(InstructionType.CHOCOLATE);
        assertThat(order.getNbSugar()).isEqualTo(0);
        assertThat(order.hasStick()).isFalse();
    }

    @Test
    public void should_create_order_when_giving_valid_instructions_C_2_0() {
        // Given
        String instruction = "C:2:0";

        // When
        DrinkOrder order = drinkMaker.parseInstruction(instruction);

        // Then
        assertThat(order.getInstructionType()).isEqualTo(InstructionType.COFFEE);
        assertThat(order.getNbSugar()).isEqualTo(2);
        assertThat(order.hasStick()).isTrue();
    }

    @Test
    public void should_forward_message_to_the_coffee_machine_when_giving_valid_instructions_M() {
        // Given
        String instruction = "M:hello";

        // When
        DrinkOrder order = drinkMaker.parseInstruction(instruction);

        // Then
        assertThat(order).isNull();
        assertThat(coffeeMachine.getMessage()).isEqualTo("hello");
    }
}
