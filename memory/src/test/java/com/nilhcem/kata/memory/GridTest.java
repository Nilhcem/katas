package com.nilhcem.kata.memory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GridTest {

    @Test
    public void should_initialize_a_grid_with_two_similar_cards_for_each_entry() {
        Grid grid = new Grid("Fox");
        assertThat(grid.getNbCards()).isEqualTo(2);
    }
}
