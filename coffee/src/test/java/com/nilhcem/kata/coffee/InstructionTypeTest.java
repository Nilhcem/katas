package com.nilhcem.kata.coffee;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class InstructionTypeTest {

    @Test
    public void should_return_TEA_when_giving_instruction_T() {
        InstructionType type = InstructionType.getFromInstruction("T");
        Assertions.assertThat(type).isEqualTo(InstructionType.TEA);
    }

    @Test
    public void should_return_CHOCOLATE_when_giving_instruction_H() {
        InstructionType type = InstructionType.getFromInstruction("H");
        Assertions.assertThat(type).isEqualTo(InstructionType.CHOCOLATE);
    }

    @Test
    public void should_return_COFFEE_when_giving_instruction_C() {
        InstructionType type = InstructionType.getFromInstruction("C");
        Assertions.assertThat(type).isEqualTo(InstructionType.COFFEE);
    }

    @Test
    public void should_return_MESSAGE_when_giving_instruction_M() {
        InstructionType type = InstructionType.getFromInstruction("M");
        Assertions.assertThat(type).isEqualTo(InstructionType.MESSAGE);
    }

    @Test
    public void should_return_null_when_giving_unknown_instruction() {
        InstructionType type = InstructionType.getFromInstruction("Z");
        Assertions.assertThat(type).isNull();
    }
}
