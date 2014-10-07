package com.nilhcem.kata.coffee;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
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
    public void should_make_a_drink_when_giving_enough_money() {
        coffeeMachine.enterMoney(100);
        DrinkOrder order = coffeeMachine.makeDrink("T:3:0");
        assertThat(order).isNotNull();
        verify(coffeeMachine, times(0)).displayMessage(anyBoolean(), anyString());
    }
}
