package com.nilhcem.kata.memory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GridTest {

    private Grid grid = new Grid("Fox");

    @Test
    public void should_initialize_a_grid_with_two_similar_cards_for_each_entry() {
        assertThat(grid.getNbCards()).isEqualTo(2);
    }

    @Test
    public void should_flip_a_card_from_the_grid() {
        grid.flipCard(0);
        assertThat(grid.cards[0].isFaceDown()).isFalse();
        assertThat(grid.cards[1].isFaceDown()).isTrue();
    }

    @Test
    public void should_be_null_when_getting_previously_flipped_card_when_never_having_flipped_a_card() {
        assertThat(grid.previouslyFlippedCard).isNull();
    }

    @Test
    public void should_save_previously_flipped_card() {
        grid.flipCard(1);
        assertThat(grid.previouslyFlippedCard).isSameAs(grid.cards[1]);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void should_throw_error_when_flipping_twice_the_same_card() {
        grid.flipCard(0);
        grid.flipCard(0);
    }
}
