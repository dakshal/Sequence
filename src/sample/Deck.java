package sample;

import java.util.ArrayList;
import java.util.Random;

public class Deck extends Card {

    ArrayList<Card> deck;

    public Deck(int number) {
        if (number == 1) {
            this.deck = createADeck();
        } else {
            this.deck = createTwoDeck();
        }
    }

    private ArrayList<Card> createADeck() {

        ArrayList<Card> deck = new ArrayList<>(52);

        deck.add(new Card(0, "clubs", "A"));
        deck.add(new Card(1, "clubs", "2"));
        deck.add(new Card(2, "clubs", "3"));
        deck.add(new Card(3, "clubs", "4"));
        deck.add(new Card(4, "clubs", "5"));
        deck.add(new Card(5, "clubs", "6"));
        deck.add(new Card(6, "clubs", "7"));
        deck.add(new Card(7, "clubs", "8"));
        deck.add(new Card(8, "clubs", "9"));
        deck.add(new Card(9, "clubs", "10"));
        deck.add(new Card(10, "clubs", "J"));
        deck.add(new Card(11, "clubs", "Q"));
        deck.add(new Card(12, "clubs", "K"));

        deck.add(new Card(13, "diamonds", "A"));
        deck.add(new Card(14, "diamonds", "2"));
        deck.add(new Card(15, "diamonds", "3"));
        deck.add(new Card(16, "diamonds", "4"));
        deck.add(new Card(17, "diamonds", "5"));
        deck.add(new Card(18, "diamonds", "6"));
        deck.add(new Card(19, "diamonds", "7"));
        deck.add(new Card(20, "diamonds", "8"));
        deck.add(new Card(21, "diamonds", "9"));
        deck.add(new Card(22, "diamonds", "10"));
        deck.add(new Card(23, "diamonds", "J"));
        deck.add(new Card(24, "diamonds", "Q"));
        deck.add(new Card(25, "diamonds", "K"));

        deck.add(new Card(26, "hearts", "A"));
        deck.add(new Card(27, "hearts", "2"));
        deck.add(new Card(28, "hearts", "3"));
        deck.add(new Card(29, "hearts", "4"));
        deck.add(new Card(30, "hearts", "5"));
        deck.add(new Card(31, "hearts", "6"));
        deck.add(new Card(32, "hearts", "7"));
        deck.add(new Card(33, "hearts", "8"));
        deck.add(new Card(34, "hearts", "9"));
        deck.add(new Card(35, "hearts", "10"));
        deck.add(new Card(36, "hearts", "J"));
        deck.add(new Card(37, "hearts", "Q"));
        deck.add(new Card(38, "hearts", "K"));

        deck.add(new Card(39, "spades", "A"));
        deck.add(new Card(40, "spades", "2"));
        deck.add(new Card(41, "spades", "3"));
        deck.add(new Card(42, "spades", "4"));
        deck.add(new Card(43, "spades", "5"));
        deck.add(new Card(44, "spades", "6"));
        deck.add(new Card(45, "spades", "7"));
        deck.add(new Card(46, "spades", "8"));
        deck.add(new Card(47, "spades", "9"));
        deck.add(new Card(48, "spades", "10"));
        deck.add(new Card(49, "spades", "J"));
        deck.add(new Card(50, "spades", "Q"));
        deck.add(new Card(51, "spades", "K"));

        return deck;
    }

    private ArrayList<Card> createTwoDeck() {
        deck = createADeck();
        System.out.println("length of deck:- " + deck.size());
        deck.addAll(createADeck());
        System.out.println("length of deck:- " + deck.size());
        return deck;
    }

    public Card getCard(String type, String value) {
        for (Card card : deck) {
            if (card.getType() == type && card.getValue() == value) {
                return card;
            }
        }
        return null;
    }

    public Card getShuffledCard() {
        if (deck != null) {
            Random rand = new Random();
            int card_pos = rand.nextInt(deck.size());
            return deck.remove(card_pos);
        } else {
            return null;
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }
}
