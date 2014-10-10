package com.nilhcem.kata.hundreddoors;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RoomTest {

    private Room room = new Room();

    @Test
    public void should_contain_100_doors() {
        Assertions.assertThat(room.getAllDoors()).hasSize(100);
    }
}
