package sample;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> cards;
    private Coin coin;

    public Player(ArrayList<Card> cards, Coin coin) {
        this.cards = cards;
        this.coin = coin;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Coin getCoin() {
        return coin;
    }
}
