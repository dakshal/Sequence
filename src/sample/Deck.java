package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck extends Card {

    Card[] deck;

    public Card[] createADeck(Card[] deck) {

        if(deck == null)
            deck = new Card[52];

        deck[0] = new Card(0, "clubs", "A");
        deck[1] = new Card(1, "clubs", "2");
        deck[2] = new Card(2, "clubs", "3");
        deck[3] = new Card(3, "clubs", "4");
        deck[4] = new Card(4, "clubs", "5");
        deck[5] = new Card(5, "clubs", "6");
        deck[6] = new Card(6, "clubs", "7");
        deck[7] = new Card(7, "clubs", "8");
        deck[8] = new Card(8, "clubs", "9");
        deck[9] = new Card(9, "clubs", "10");
        deck[10] = new Card(10, "clubs", "J");
        deck[11] = new Card(11, "clubs", "Q");
        deck[12] = new Card(12, "clubs", "K");

        deck[13] = new Card(13, "diamonds", "A");
        deck[14] = new Card(14, "diamonds", "2");
        deck[15] = new Card(15, "diamonds", "3");
        deck[16] = new Card(16, "diamonds", "4");
        deck[17] = new Card(17, "diamonds", "5");
        deck[18] = new Card(18, "diamonds", "6");
        deck[19] = new Card(19, "diamonds", "7");
        deck[20] = new Card(20, "diamonds", "8");
        deck[21] = new Card(21, "diamonds", "9");
        deck[22] = new Card(22, "diamonds", "10");
        deck[23] = new Card(23, "diamonds", "J");
        deck[24] = new Card(24, "diamonds", "Q");
        deck[25] = new Card(25, "diamonds", "K");

        deck[26] = new Card(26, "hearts", "A");
        deck[27] = new Card(27, "hearts", "2");
        deck[28] = new Card(28, "hearts", "3");
        deck[29] = new Card(29, "hearts", "4");
        deck[30] = new Card(30, "hearts", "5");
        deck[31] = new Card(31, "hearts", "6");
        deck[32] = new Card(32, "hearts", "7");
        deck[33] = new Card(33, "hearts", "8");
        deck[34] = new Card(34, "hearts", "9");
        deck[35] = new Card(35, "hearts", "10");
        deck[36] = new Card(36, "hearts", "J");
        deck[37] = new Card(37, "hearts", "Q");
        deck[38] = new Card(38, "hearts", "K");

        deck[39] = new Card(39, "spades", "A");
        deck[40] = new Card(40, "spades", "2");
        deck[41] = new Card(41, "spades", "3");
        deck[42] = new Card(42, "spades", "4");
        deck[43] = new Card(43, "spades", "5");
        deck[44] = new Card(44, "spades", "6");
        deck[45] = new Card(45, "spades", "7");
        deck[46] = new Card(46, "spades", "8");
        deck[47] = new Card(47, "spades", "9");
        deck[48] = new Card(48, "spades", "10");
        deck[49] = new Card(49, "spades", "J");
        deck[50] = new Card(50, "spades", "Q");
        deck[51] = new Card(51, "spades", "K");

        return deck;
    }

    public Card[] createTwoDeck(){
        deck = new Card[104];
        List list = new ArrayList(Arrays.asList(createADeck(new Card[52])));
        list.addAll(Arrays.asList(createADeck(new Card[52])));
        deck = (Card[]) list.toArray();
        System.out.println("length of deck:- "+ deck);
        return deck;
    }

    public Card getCard(String type, String value){
        for(Card card: deck){
            if(card.getType() == type && card.getValue() == value){
                return card;
            }
        }
        return null;
    }

}
