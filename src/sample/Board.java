package sample;

public class Board {

    private BoardCard[][] game;
    private Card[] cards;

    private BoardCard[][] createNewGame(){
        BoardCard[][] newBoard = new BoardCard[10][10];
        Deck deck = new Deck();
        cards = deck.createADeck(new Card[52]);
        return newBoard;
    }

    public Board(){
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
        game[0][1] = new BoardCard(null, cards[40], false, false);
        game[0][2] = new BoardCard(null, cards[41], false, false);
        game[0][3] = new BoardCard(null, cards[42], false, false);
        game[0][4] = new BoardCard(null, cards[43], false, false);
        game[0][5] = new BoardCard(null, cards[44], false, false);
        game[0][6] = new BoardCard(null, cards[45], false, false);
        game[0][7] = new BoardCard(null, cards[46], false, false);
        game[0][8] = new BoardCard(null, cards[47], false, false);
        game[1][9] = new BoardCard(null, cards[48], false, false);
        game[2][9] = new BoardCard(null, cards[50], false, false);
        game[3][9] = new BoardCard(null, cards[51], false, false);
        game[4][9] = new BoardCard(null, cards[39], false, false);

        // setting up all the diamonds
        game[5][9] = new BoardCard(null, cards[14], false, false);
        game[6][9] = new BoardCard(null, cards[15], false, false);
        game[7][9] = new BoardCard(null, cards[16], false, false);
        game[8][9] = new BoardCard(null, cards[17], false, false);
        game[9][8] = new BoardCard(null, cards[18], false, false);
        game[9][7] = new BoardCard(null, cards[19], false, false);
        game[9][6] = new BoardCard(null, cards[20], false, false);
        game[9][5] = new BoardCard(null, cards[21], false, false);
        game[9][4] = new BoardCard(null, cards[22], false, false);
        game[9][3] = new BoardCard(null, cards[24], false, false);
        game[9][2] = new BoardCard(null, cards[25], false, false);
        game[9][1] = new BoardCard(null, cards[13], false, false);

        // setting up all the clubs
        game[1][4] = new BoardCard(null, cards[1], false, false);
        game[1][3] = new BoardCard(null, cards[2], false, false);
        game[1][2] = new BoardCard(null, cards[3], false, false);
        game[1][1] = new BoardCard(null, cards[4], false, false);
        game[1][0] = new BoardCard(null, cards[5], false, false);
        game[2][0] = new BoardCard(null, cards[6], false, false);
        game[3][0] = new BoardCard(null, cards[7], false, false);
        game[4][0] = new BoardCard(null, cards[8], false, false);
        game[5][0] = new BoardCard(null, cards[9], false, false);
        game[6][0] = new BoardCard(null, cards[11], false, false);
        game[7][0] = new BoardCard(null, cards[12], false, false);
        game[8][0] = new BoardCard(null, cards[0], false, false);

        // setting up all hearts
        game[1][5] = new BoardCard(null, cards[26], false, false);
        game[1][6] = new BoardCard(null, cards[38], false, false);
        game[1][7] = new BoardCard(null, cards[37], false, false);
        game[1][8] = new BoardCard(null, cards[35], false, false);
        game[2][8] = new BoardCard(null, cards[34], false, false);
        game[3][8] = new BoardCard(null, cards[33], false, false);
        game[4][8] = new BoardCard(null, cards[32], false, false);
        game[5][8] = new BoardCard(null, cards[31], false, false);
        game[6][8] = new BoardCard(null, cards[30], false, false);
        game[7][8] = new BoardCard(null, cards[29], false, false);
        game[8][8] = new BoardCard(null, cards[28], false, false);
        game[8][7] = new BoardCard(null, cards[27], false, false);

        // setting up all the spades
        game[8][6] = new BoardCard(null, cards[40], false, false);
        game[8][5] = new BoardCard(null, cards[41], false, false);
        game[8][4] = new BoardCard(null, cards[42], false, false);
        game[8][3] = new BoardCard(null, cards[43], false, false);
        game[8][2] = new BoardCard(null, cards[44], false, false);
        game[8][1] = new BoardCard(null, cards[45], false, false);
        game[7][1] = new BoardCard(null, cards[46], false, false);
        game[6][1] = new BoardCard(null, cards[47], false, false);
        game[5][1] = new BoardCard(null, cards[48], false, false);
        game[4][1] = new BoardCard(null, cards[50], false, false);
        game[3][1] = new BoardCard(null, cards[51], false, false);
        game[2][1] = new BoardCard(null, cards[39], false, false);

        // setting up all the diamonds
        game[2][2] = new BoardCard(null, cards[14], false, false);
        game[2][3] = new BoardCard(null, cards[15], false, false);
        game[2][4] = new BoardCard(null, cards[16], false, false);
        game[2][5] = new BoardCard(null, cards[17], false, false);
        game[2][6] = new BoardCard(null, cards[18], false, false);
        game[2][7] = new BoardCard(null, cards[19], false, false);
        game[3][7] = new BoardCard(null, cards[20], false, false);
        game[4][7] = new BoardCard(null, cards[21], false, false);
        game[5][7] = new BoardCard(null, cards[22], false, false);
        game[6][7] = new BoardCard(null, cards[24], false, false);
        game[7][7] = new BoardCard(null, cards[25], false, false);
        game[7][6] = new BoardCard(null, cards[13], false, false);

        // setting up all the clubs
        game[7][5] = new BoardCard(null, cards[0], false, false);
        game[7][4] = new BoardCard(null, cards[12], false, false);
        game[7][3] = new BoardCard(null, cards[11], false, false);
        game[7][2] = new BoardCard(null, cards[9], false, false);
        game[6][2] = new BoardCard(null, cards[8], false, false);
        game[5][2] = new BoardCard(null, cards[7], false, false);
        game[4][2] = new BoardCard(null, cards[6], false, false);
        game[3][2] = new BoardCard(null, cards[5], false, false);
        game[3][3] = new BoardCard(null, cards[4], false, false);
        game[3][4] = new BoardCard(null, cards[3], false, false);
        game[3][5] = new BoardCard(null, cards[2], false, false);
        game[3][6] = new BoardCard(null, cards[1], false, false);

        // setting up all hearts
        game[4][6] = new BoardCard(null, cards[26], false, false);
        game[5][6] = new BoardCard(null, cards[38], false, false);
        game[6][6] = new BoardCard(null, cards[37], false, false);
        game[6][5] = new BoardCard(null, cards[35], false, false);
        game[6][4] = new BoardCard(null, cards[34], false, false);
        game[6][3] = new BoardCard(null, cards[33], false, false);
        game[5][3] = new BoardCard(null, cards[32], false, false);
        game[4][3] = new BoardCard(null, cards[31], false, false);
        game[4][4] = new BoardCard(null, cards[30], false, false);
        game[4][5] = new BoardCard(null, cards[29], false, false);
        game[5][5] = new BoardCard(null, cards[28], false, false);
        game[5][4] = new BoardCard(null, cards[27], false, false);

        return game;
    }

    public BoardCard[][] getGame(){
        return game;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
}
