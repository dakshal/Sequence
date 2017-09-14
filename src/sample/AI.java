package sample;

public class AI {

    public static final int MATCH_WIN_COST = 1;
    public static final int OPPONENT_PANELTY = -10;
    public static final int MATCH_LOSE_COST = -100;
    public static final int DRAW_COST = 0;

    public void createWeightedMap(Board board, int color) {
        BoardCard[][] game = board.getGame();

        int[][] scoreMap = new int[10][10];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int count = 0;
                for (int k = 0; k < 5; k++) {
                    int posColor = game[i][j].getCoin().getColor();
                    if (posColor == color || posColor == 0) {

                    }
                }

                if (game[i][j].getCoin().getColor() == color && game[i + 1][j].getCoin().getColor() == color && game[i + 2][j].getCoin().getColor() == color && game[i + 3][j].getCoin().getColor() == color && game[i + 4][j].getCoin().getColor() == color) {
                    scoreMap[i][j] += 1;
                }

                if (game[i][j + 1].getCoin().getColor() == color && game[i][j + 2].getCoin().getColor() == color && game[i][j + 3].getCoin().getColor() == color && game[i][j + 4].getCoin().getColor() == color) {
//                    scoreMap[color] += 1;
                }

                if (game[i + 1][j + 1].getCoin().getColor() == color && game[i + 2][j + 2].getCoin().getColor() == color && game[i + 3][j + 3].getCoin().getColor() == color && game[i + 4][j + 4].getCoin().getColor() == color) {
//                    scoreMap[color] += 1;
                }

                color = game[i][j + 4].getCoin().getColor();

                if (game[i + 1][j + 3].getCoin().getColor() == color && game[i + 2][j + 2].getCoin().getColor() == color && game[i + 3][j + 1].getCoin().getColor() == color && game[i + 4][j].getCoin().getColor() == color) {
//                    scoreMap[color] += 1;
                }
            }
        }
    }

    public void findMatch(int[][] map) {

    }
}
