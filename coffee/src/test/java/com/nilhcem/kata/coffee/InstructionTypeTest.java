package com.nilhcem.kata.coffee;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InstructionTypeTest {

    @Test
    public void should_return_TEA_when_giving_instruction_T() {
        InstructionType type = InstructionType.getFromInstruction("T");
        assertThat(type).isEqualTo(InstructionType.TEA);
        assertThat(type.canBeExtraHot()).isTrue();
    }

    @Test
    public void should_return_CHOCOLATE_when_giving_instruction_H() {
        InstructionType type = InstructionType.getFromInstruction("H");
        assertThat(type).isEqualTo(InstructionType.CHOCOLATE);
        assertThat(type.canBeExtraHot()).isTrue();
    }

    @Test
    public void should_return_COFFEE_when_giving_instruction_C() {
        InstructionType type = InstructionType.getFromInstruction("C");
        assertThat(type).isEqualTo(InstructionType.COFFEE);
        assertThat(type.canBeExtraHot()).isTrue();
    }

    @Test
    public void should_return_MESSAGE_when_giving_instruction_M() {
        InstructionType type = InstructionType.getFromInstruction("M");
        assertThat(type).isEqualTo(InstructionType.MESSAGE);
        assertThat(type.canBeExtraHot()).isFalse();
    }

    @Test
    public void should_return_ORANGE_JUICE_when_giving_instruction_O() {
        InstructionType type = InstructionType.getFromInstruction("O");
        assertThat(type).isEqualTo(InstructionType.ORANGE_JUICE);
        assertThat(type.canBeExtraHot()).isFalse();
    }

    @Test
    public void should_return_null_when_giving_unknown_instruction() {
        InstructionType type = InstructionType.getFromInstruction("Z");
        assertThat(type).isNull();
    }
}
