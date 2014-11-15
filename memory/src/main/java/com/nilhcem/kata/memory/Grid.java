package com.nilhcem.kata.memory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grid {

    final Card[] cards;
    Card previouslyFlippedCard;

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

    public void flipCard(int position) {
        cards[position].flip();
        previouslyFlippedCard = cards[position];
    }
}
