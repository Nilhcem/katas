package com.nilhcem.kata.memory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

    @Test
    public void should_be_face_down_when_created() {
        Card card = new Card("CardTitle");
        assertThat(card.isFaceDown()).isTrue();
    }
}
