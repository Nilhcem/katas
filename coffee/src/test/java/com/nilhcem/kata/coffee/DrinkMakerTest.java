package com.nilhcem.kata.coffee;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrinkMakerTest {

    DrinkMaker drinkMaker = new DrinkMaker();

    @Test
    public void should_create_tea_order_when_giving_instruction_T() {
        // Given
        String instruction = "T:1:0";

        // When
        DrinkOrder order = drinkMaker.parseInstruction(instruction);

        // Then
        assertThat(order.getInstructionType()).isEqualTo(InstructionType.TEA);
    }
}
