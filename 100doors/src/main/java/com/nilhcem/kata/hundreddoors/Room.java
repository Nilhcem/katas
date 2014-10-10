package com.nilhcem.kata.hundreddoors;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private static final int NB_DOORS = 100;

    private List<Door> doors;

    public Room() {
        doors = new ArrayList<>(NB_DOORS);
        for (int i = 0; i < NB_DOORS; i++) {
            doors.add(new Door());
        }
    }

    public List<Door> getAllDoors() {
        return doors;
    }
}
