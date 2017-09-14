package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Board board;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        setupBoard();

        if(board!= null){
            int[][] map = new int[10][10];

            for(int i=0; i<6; i++){
                for(int j=0; j<6; j++){
                    for(int k=0; k<5; k++){
                        for(int l=0; l<5; l++){
                            map[i+l][j+k] += 1;
                        }
                    }
                    for(int k=0; k<5; k++){
                        for(int l=0; l<5; l++){
                            map[i+k][j+l] += 1;
                        }
                    }
                    for(int k=0; k<5; k++){
                        map[i+k][j+k] += 1;
                    }
                    for(int k=0; k<5; k++){
                        map[i+k][j+4-k] += 1;
                    }
                }
            }
 
            printBoard(map);
        }

        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }

    private void printBoard(int[][] map) {
        for(int i=0 ;i<10; i++){
            for (int j=0; j<10; j++) {
                System.out.print(map[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    private void setupBoard() {
        board = new Board();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
