package sample;

public class BoardCard extends Card {
    private Coin coin;
    private Card card;
    private boolean filled;
    private boolean jack;

    public BoardCard(Coin coin, Card card, boolean filled, boolean jack) {
        this.coin = coin;
        this.card = card;
        this.filled = filled;
        this.jack = jack;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public boolean isJack() {
        return jack;
    }
}
