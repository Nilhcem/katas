package com.nilhcem.kata.hundreddoors;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoomTest {

    private Room room = new Room();

    @Test
    public void should_contain_100_doors() {
        assertThat(room.getAllDoors()).hasSize(100);
    }

    @Test
    public void all_doors_should_be_closed_initially() {
        for (Door door : room.getAllDoors()) {
            assertThat(door.isOpened()).isFalse();
        }
    }
}
