package com.nilhcem.kata.memory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

    private Card card = new Card("title");

    @Test
    public void should_be_face_down_when_created() {
        assertThat(card.isFaceDown()).isTrue();
    }

    @Test
    public void should_be_face_up_when_flipped_while_face_down() {
        card.flip();
        assertThat(card.isFaceDown()).isFalse();
    }

    @Test
    public void should_be_face_down_when_flipped_while_face_up() {
        card.flip();
        card.flip();
        assertThat(card.isFaceDown()).isTrue();
    }
}
