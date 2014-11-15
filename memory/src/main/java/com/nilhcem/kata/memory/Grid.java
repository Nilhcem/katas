package com.nilhcem.kata.memory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grid {

    private final Card[] cards;

    public Grid(String... cards) {
        List<Card> deck = new ArrayList<>();
        for (String card : cards) {
            deck.add(new Card(card));
            deck.add(new Card(card));
        }
        Collections.shuffle(deck);
        this.cards = deck.toArray(new Card[deck.size()]);
    }

    public int getNbCards() {
        return cards.length;
    }
}
