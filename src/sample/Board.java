package sample;

import java.util.ArrayList;

public class Board {

    private BoardCard[][] game;
    private ArrayList<Card> cards;

    private BoardCard[][] createNewGame() {
        BoardCard[][] newBoard = new BoardCard[10][10];
        Deck deck = new Deck(1);
        cards = deck.getDeck();
        return newBoard;
    }

    public Board() {
        game = createNewGame();
        game = assignPositions(game);
    }

    private BoardCard[][] assignPositions(BoardCard[][] game) {
        // setting up all the jacks
        game[0][0] = new BoardCard(null, null, false, true);
        game[0][9] = new BoardCard(null, null, false, true);
        game[9][0] = new BoardCard(null, null, false, true);
        game[9][9] = new BoardCard(null, null, false, true);

        // setting up all the spades
        game[0][1] = new BoardCard(null, cards.get(40), false, false);
        game[0][2] = new BoardCard(null, cards.get(41), false, false);
        game[0][3] = new BoardCard(null, cards.get(42), false, false);
        game[0][4] = new BoardCard(null, cards.get(43), false, false);
        game[0][5] = new BoardCard(null, cards.get(44), false, false);
        game[0][6] = new BoardCard(null, cards.get(45), false, false);
        game[0][7] = new BoardCard(null, cards.get(46), false, false);
        game[0][8] = new BoardCard(null, cards.get(47), false, false);
        game[1][9] = new BoardCard(null, cards.get(48), false, false);
        game[2][9] = new BoardCard(null, cards.get(50), false, false);
        game[3][9] = new BoardCard(null, cards.get(51), false, false);
        game[4][9] = new BoardCard(null, cards.get(39), false, false);

// setting up all the diamonds
        game[5][9] = new BoardCard(null, cards.get(14), false, false);
        game[6][9] = new BoardCard(null, cards.get(15), false, false);
        game[7][9] = new BoardCard(null, cards.get(16), false, false);
        game[8][9] = new BoardCard(null, cards.get(17), false, false);
        game[9][8] = new BoardCard(null, cards.get(18), false, false);
        game[9][7] = new BoardCard(null, cards.get(19), false, false);
        game[9][6] = new BoardCard(null, cards.get(20), false, false);
        game[9][5] = new BoardCard(null, cards.get(21), false, false);
        game[9][4] = new BoardCard(null, cards.get(22), false, false);
        game[9][3] = new BoardCard(null, cards.get(24), false, false);
        game[9][2] = new BoardCard(null, cards.get(25), false, false);
        game[9][1] = new BoardCard(null, cards.get(13), false, false);

// setting up all the clubs
        game[1][4] = new BoardCard(null, cards.get(1), false, false);
        game[1][3] = new BoardCard(null, cards.get(2), false, false);
        game[1][2] = new BoardCard(null, cards.get(3), false, false);
        game[1][1] = new BoardCard(null, cards.get(4), false, false);
        game[1][0] = new BoardCard(null, cards.get(5), false, false);
        game[2][0] = new BoardCard(null, cards.get(6), false, false);
        game[3][0] = new BoardCard(null, cards.get(7), false, false);
        game[4][0] = new BoardCard(null, cards.get(8), false, false);
        game[5][0] = new BoardCard(null, cards.get(9), false, false);
        game[6][0] = new BoardCard(null, cards.get(11), false, false);
        game[7][0] = new BoardCard(null, cards.get(12), false, false);
        game[8][0] = new BoardCard(null, cards.get(0), false, false);

// setting up all hearts
        game[1][5] = new BoardCard(null, cards.get(26), false, false);
        game[1][6] = new BoardCard(null, cards.get(38), false, false);
        game[1][7] = new BoardCard(null, cards.get(37), false, false);
        game[1][8] = new BoardCard(null, cards.get(35), false, false);
        game[2][8] = new BoardCard(null, cards.get(34), false, false);
        game[3][8] = new BoardCard(null, cards.get(33), false, false);
        game[4][8] = new BoardCard(null, cards.get(32), false, false);
        game[5][8] = new BoardCard(null, cards.get(31), false, false);
        game[6][8] = new BoardCard(null, cards.get(30), false, false);
        game[7][8] = new BoardCard(null, cards.get(29), false, false);
        game[8][8] = new BoardCard(null, cards.get(28), false, false);
        game[8][7] = new BoardCard(null, cards.get(27), false, false);

// setting up all the spades
        game[8][6] = new BoardCard(null, cards.get(40), false, false);
        game[8][5] = new BoardCard(null, cards.get(41), false, false);
        game[8][4] = new BoardCard(null, cards.get(42), false, false);
        game[8][3] = new BoardCard(null, cards.get(43), false, false);
        game[8][2] = new BoardCard(null, cards.get(44), false, false);
        game[8][1] = new BoardCard(null, cards.get(45), false, false);
        game[7][1] = new BoardCard(null, cards.get(46), false, false);
        game[6][1] = new BoardCard(null, cards.get(47), false, false);
        game[5][1] = new BoardCard(null, cards.get(48), false, false);
        game[4][1] = new BoardCard(null, cards.get(50), false, false);
        game[3][1] = new BoardCard(null, cards.get(51), false, false);
        game[2][1] = new BoardCard(null, cards.get(39), false, false);

// setting up all the diamonds
        game[2][2] = new BoardCard(null, cards.get(14), false, false);
        game[2][3] = new BoardCard(null, cards.get(15), false, false);
        game[2][4] = new BoardCard(null, cards.get(16), false, false);
        game[2][5] = new BoardCard(null, cards.get(17), false, false);
        game[2][6] = new BoardCard(null, cards.get(18), false, false);
        game[2][7] = new BoardCard(null, cards.get(19), false, false);
        game[3][7] = new BoardCard(null, cards.get(20), false, false);
        game[4][7] = new BoardCard(null, cards.get(21), false, false);
        game[5][7] = new BoardCard(null, cards.get(22), false, false);
        game[6][7] = new BoardCard(null, cards.get(24), false, false);
        game[7][7] = new BoardCard(null, cards.get(25), false, false);
        game[7][6] = new BoardCard(null, cards.get(13), false, false);

// setting up all the clubs
        game[7][5] = new BoardCard(null, cards.get(0), false, false);
        game[7][4] = new BoardCard(null, cards.get(12), false, false);
        game[7][3] = new BoardCard(null, cards.get(11), false, false);
        game[7][2] = new BoardCard(null, cards.get(9), false, false);
        game[6][2] = new BoardCard(null, cards.get(8), false, false);
        game[5][2] = new BoardCard(null, cards.get(7), false, false);
        game[4][2] = new BoardCard(null, cards.get(6), false, false);
        game[3][2] = new BoardCard(null, cards.get(5), false, false);
        game[3][3] = new BoardCard(null, cards.get(4), false, false);
        game[3][4] = new BoardCard(null, cards.get(3), false, false);
        game[3][5] = new BoardCard(null, cards.get(2), false, false);
        game[3][6] = new BoardCard(null, cards.get(1), false, false);

// setting up all hearts
        game[4][6] = new BoardCard(null, cards.get(26), false, false);
        game[5][6] = new BoardCard(null, cards.get(38), false, false);
        game[6][6] = new BoardCard(null, cards.get(37), false, false);
        game[6][5] = new BoardCard(null, cards.get(35), false, false);
        game[6][4] = new BoardCard(null, cards.get(34), false, false);
        game[6][3] = new BoardCard(null, cards.get(33), false, false);
        game[5][3] = new BoardCard(null, cards.get(32), false, false);
        game[4][3] = new BoardCard(null, cards.get(31), false, false);
        game[4][4] = new BoardCard(null, cards.get(30), false, false);
        game[4][5] = new BoardCard(null, cards.get(29), false, false);
        game[5][5] = new BoardCard(null, cards.get(28), false, false);
        game[5][4] = new BoardCard(null, cards.get(27), false, false);

        return game;
    }

    public BoardCard[][] getGame() {
        return game;
    }

    public boolean assignCard(Card card, int x, int y, Coin coin){
        if(game[x][y].getCoin()== null && !game[x][y].isJack()) {
            if(game[x][y].getCard().getNumber() == card.getNumber()){
                game[x][y].setCard(card);
                game[x][y].setCoin(coin);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
