package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Board board;
    Deck deck;
    Status status;
    private static final int NO_OF_PLAYERS = 2;
    private ArrayList<Player> players = new ArrayList<>();

//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");

    public void start() {
        setupGame();
        Scanner sc = new Scanner(System.in);

        if (board != null) {

            distributeCards();
            printBoard(board);

            while (gameOver()<100) {
                for (int i=0; i<NO_OF_PLAYERS; i++) {
                    Player player = players.get(i);
                    System.out.println("Here Are your cards:- ");
                    for (Card card : player.getCards()) {
                        System.out.println(card.getValue() + " of " + card.getType());
                    }
                    System.out.println("type from 1 to 6 to pick your card followed by position on the board:- ");

                    int card_pos = sc.nextInt();
                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    if(board.assignCard(player.getCards().get(card_pos-1), x, y, new Coin(player.getCoin().getColor()))){
                        player.getCards().remove(card_pos);
                        player.getCards().add(deck.getShuffledCard());
                    } else {
                        System.out.println("that is invalid input\nPlease provide valid position and valid card");
                        i--;
                        continue;
                    }
                    printBoard(board);
                }
            }
        }

//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();

    }

    private int gameOver() {
        int checkStatus = status.isGameOver(board);
        if(checkStatus > 100){
            return checkStatus;
        }
        return 0;
    }

    private void distributeCards() {
        for (int i = 0; i < NO_OF_PLAYERS; i++) {
            ArrayList<Card> cards = new ArrayList<>(6);
            for (int j = 0; j < 6; j++) {
                cards.add(deck.getShuffledCard());
            }
            Player player = new Player(cards, new Coin(i));
            players.add(player);
        }
    }

    private void printBoard(Board board) {
        BoardCard[][] game = board.getGame();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                BoardCard card = game[i][j];
                if(card.getCard() == null){
                    System.out.print("Jack" + "\t\t");
                } else {
                    if (card.getCoin() != null) {
                        System.out.print(card.getCard().getValue() + " " + card.getCard().getType().toUpperCase().charAt(0) + " " + card.getCoin().getColor() + "" + "\t\t");
                    } else {
                        System.out.print(card.getCard().getValue() + " " + card.getCard().getType().toUpperCase().charAt(0) + " " + " " + "" + "\t\t");
                    }
                }
            }
            System.out.println("");
        }
    }

    private void setupGame() {
        board = new Board();
        deck = new Deck(2);
        status = new Status();
    }


    public static void main(String[] args) {
        new Main().start();
    }
}
