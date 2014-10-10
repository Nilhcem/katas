package com.nilhcem.kata.hundreddoors;

public class Door {

    int idx;
    boolean opened;

    public Door(int idx) {
        this.idx = idx;
    }

    public boolean isOpened() {
        return opened;
    }

    public void toggle() {
        opened = !opened;
    }

    @Override
    public String toString() {
        return String.format("#%03d: %s", idx, isOpened() ? "opened" : "closed");
    }
}
