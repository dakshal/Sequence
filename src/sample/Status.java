package sample;

public class Status {

    public int isGameOver(Board board) {
        BoardCard[][] game = board.getGame();
        GlobalParams params = new GlobalParams();

        int[] score = new int[params.getTeams()];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                for (int k = 0; k < 5; k++) {
                    if (game[i][j + k].getCoin() == null) {
                        continue;
                    }
                    int color = game[i][j + k].getCoin().getColor();
                    if (game[i + 1][j + k].getCoin().getColor() == color && game[i + 2][j + k].getCoin().getColor() == color && game[i + 3][j + k].getCoin().getColor() == color && game[i + 4][j + k].getCoin().getColor() == color) {
                        score[color] += 1;
                    }
                }

                for (int k = 0; k < 5; k++) {
                    if (game[i + k][j].getCoin() == null) {
                        continue;
                    }
                    int color = game[i + k][j].getCoin().getColor();
                    if (game[i + k][j + 1].getCoin().getColor() == color && game[i + k][j + 2].getCoin().getColor() == color && game[i + k][j + 3].getCoin().getColor() == color && game[i + k][j + 4].getCoin().getColor() == color) {
                        score[color] += 1;
                    }
                }

                if (game[i][j].getCoin() != null) {
                    int color = game[i][j].getCoin().getColor();
                    if (game[i + 1][j + 1].getCoin().getColor() == color && game[i + 2][j + 2].getCoin().getColor() == color && game[i + 3][j + 3].getCoin().getColor() == color && game[i + 4][j + 4].getCoin().getColor() == color) {
                        score[color] += 1;
                    }
                }

                if (game[i][j + 4].getCoin() != null) {
                    int color = game[i][j + 4].getCoin().getColor();
                    if (game[i + 1][j + 3].getCoin().getColor() == color && game[i + 2][j + 2].getCoin().getColor() == color && game[i + 3][j + 1].getCoin().getColor() == color && game[i + 4][j].getCoin().getColor() == color) {
                        score[color] += 1;
                    }
                }
            }
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] > 2) {
                return 100 + i;
            }
        }
        return 0;
    }

    public boolean isSequence(Board board, BoardCard[] cards) {

        BoardCard[][] game = board.getGame();

//        if()


        return false;
    }

}
