# Memory

## Rules

- Implement a memory game. The object of the game is to turn over pairs of matching cards.
- It consists in a card game in which all of the cards are laid face down on a surface
- The player can only cards that are laid face down
- When a player flips a card, it faces up.
- Each time two cards are flipped:
    - if the two cards are similar, they remain visible (face up)
    - if the cards are different, they are hidden (face down) and the game continues
    - the player's try count is incremented
- When all the cards are laid face up, the game is over.

## Steps

- First, implement the game logic
- Then, use the debugger to play (using "Evaluate Expression") and make sure it works

## Example

```
Game game = new Game("bird", "cat", "cow", "dog", "fish", "horse", "lion", "monkey", "panda", "tiger");
while (!game.isOver()) {
  game.flipCard(0);
  game.flipCard(15);
  ...
}
```

## Additional information

[Wikipedia](http://en.wikipedia.org/wiki/Concentration_%28game%29)
