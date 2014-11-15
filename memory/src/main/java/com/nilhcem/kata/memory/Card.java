package com.nilhcem.kata.memory;

public class Card {

    final String title;
    boolean faceDown = true;

    public Card(String title) {
        this.title = title;
    }

    public boolean isFaceDown() {
        return faceDown;
    }
}
