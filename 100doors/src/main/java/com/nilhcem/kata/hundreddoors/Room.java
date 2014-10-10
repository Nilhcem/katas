package com.nilhcem.kata.hundreddoors;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private static final int NB_DOORS = 100;

    private List<Door> doors;

    public Room() {
        doors = new ArrayList<>(NB_DOORS);
        for (int i = 0; i < NB_DOORS; i++) {
            doors.add(new Door(i + 1));
        }
    }

    public List<Door> getAllDoors() {
        return doors;
    }

    public void toggleDoorsMultipleOf(int nb) {
        for (int i = 0; i < doors.size(); i++) {
            if ((i + 1) % nb == 0) {
                doors.get(i).toggle();
            }
        }
    }
}
