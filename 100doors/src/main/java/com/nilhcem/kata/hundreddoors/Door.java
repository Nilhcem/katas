package com.nilhcem.kata.hundreddoors;

public class Door {

    boolean opened;

    public boolean isOpened() {
        return opened;
    }

    public void toggle() {
        opened = !opened;
    }
}
