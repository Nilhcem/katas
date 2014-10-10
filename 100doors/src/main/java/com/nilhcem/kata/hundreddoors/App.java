package com.nilhcem.kata.hundreddoors;

import java.util.List;

public class App {

    private static final int NB_PASSES = 100;

    public static void main(String[] args) {
        Room room = new Room();
        for (int i = 0; i < NB_PASSES; i++) {
            room.toggleDoorsMultipleOf(i + 1);
        }

        List<Door> allDoors = room.getAllDoors();
        for (Door door : allDoors) {
            System.out.println(door.toString());
        }
    }
}
