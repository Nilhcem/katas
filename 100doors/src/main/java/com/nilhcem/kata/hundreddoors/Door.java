package com.nilhcem.kata.hundreddoors;

public class Door {

    int index;
    boolean opened;

    public Door(int index) {
        this.index = index;
    }

    public boolean isOpened() {
        return opened;
    }

    public boolean isClosed() {
        return !opened;
    }

    public void toggle() {
        opened = !opened;
    }

    @Override
    public String toString() {
        return String.format("#%03d: %s", index, isOpened() ? "opened" : "closed");
    }
}
