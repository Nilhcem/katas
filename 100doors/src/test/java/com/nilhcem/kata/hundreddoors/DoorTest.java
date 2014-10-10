package com.nilhcem.kata.hundreddoors;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DoorTest {

    private Door door = new Door(1);

    @Test
    public void should_be_closed_by_default() {
        assertThat(door.isOpened()).isFalse();
    }

    @Test
    public void toggling_a_closed_door_should_open_it() {
        // Given
        door.opened = false;

        // When
        door.toggle();

        // Then
        assertThat(door.isOpened()).isTrue();
    }

    @Test
    public void toggling_an_opened_door_should_close_it() {
        // Given
        door.opened = true;

        // When
        door.toggle();

        // Then
        assertThat(door.isOpened()).isFalse();
    }
}
