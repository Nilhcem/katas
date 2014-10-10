package com.nilhcem.kata.hundreddoors;

import org.junit.Test;

import java.util.List;

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

    @Test
    public void should_open_all_doors_at_first_pass() {
        room.toggleDoorsMultipleOf(1);
        for (Door door : room.getAllDoors()) {
            assertThat(door.isOpened()).isTrue();
        }
    }

    @Test
    public void should_toggle_only_doors_multiple_of_two() {
        room.toggleDoorsMultipleOf(2);
        boolean isOpened = false;
        for (Door door : room.getAllDoors()) {
            assertThat(door.isOpened()).isEqualTo(isOpened);
            isOpened = !isOpened;
        }
    }

    @Test
    public void doors_multiple_of_two_should_be_closed_when_processing_pass_one_and_two() {
        room.toggleDoorsMultipleOf(1);
        room.toggleDoorsMultipleOf(2);
        boolean isOpened = true;
        for (Door door : room.getAllDoors()) {
            assertThat(door.isOpened()).isEqualTo(isOpened);
            isOpened = !isOpened;
        }
    }

    @Test
    public void should_toggle_only_last_door() {
        room.toggleDoorsMultipleOf(100);
        List<Door> allDoors = room.getAllDoors();
        for (int i = 0; i < 100; i++) {
            assertThat(allDoors.get(i).isOpened()).isEqualTo(i == 100 - 1);
        }
    }
}
