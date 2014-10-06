package com.nilhcem.kata.coffee;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrinkMakerTest {

    DrinkMaker drinkMaker = new DrinkMaker();

    @Test
    public void should_return_null_when_instruction_size_is_invalid() {
        assertThat(drinkMaker.parseInstruction("OMG")).isNull();
    }

    @Test
    public void should_return_null_when_instruction_type_is_invalid() {
        assertThat(drinkMaker.parseInstruction("Z:0:0")).isNull();
    }

    @Test
    public void should_return_null_when_giving_other_than_one_or_two_sugars() {
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
}
