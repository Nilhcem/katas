package com.nilhcem.kata.hundreddoors;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DoorTest {

    private Door door = new Door(1);

    @Test
    public void should_be_closed_by_default() {
        assertTrue(door.isClosed());
    }

    @Test
    public void should_be_opened_after_being_passed_while_closed() {
        // Given
        door.opened = false;

        // When
        door.toggle();

        // Then
        assertTrue(door.isOpened());
    }

    @Test
    public void should_be_closed_after_being_passed_while_opened() {
        // Given
        door.opened = true;

        // When
        door.toggle();

        // Then
        assertTrue(door.isClosed());
    }
}
