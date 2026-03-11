package Questions.TicTacToe.Models;

public class Board {
    int n;
//    int m;
    PlayingPeice [][]board;

   public Board(int n){
       this.n=n;
        this.board=new PlayingPeice[n][n];
    }

    public boolean validateMove(int x,int y){
        if(x>=n || y>=n){
            return false;
        }

        if(board[x][y]!=null){
            return false;
        }

        return true;
    }

    public void updateBoard(int x,int y,PlayingPeice peice){

            board[x][y]=peice;

    }

    public void printBoard(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]!=null){
                    System.out.print(board[i][j].getPeice());

                }else{
                    System.out.print('-');

                }
            }
            System.out.println();
        }
    }

    public boolean isWinner(int x, int y, PlayingPeice playingPeice) {
        if (playingPeice == null) {
            return false;
        }

        // row
        boolean rowMatch = true;
        for (int i = 0; i < n; i++) {
            if (board[x][i] == null || board[x][i].getPeice() != playingPeice.getPeice()) {
                rowMatch = false;
                break;
            }
        }

        // col
        boolean colMatch = true;
        for (int i = 0; i < n; i++) {
            if (board[i][y] == null || board[i][y].getPeice() != playingPeice.getPeice()) {
                colMatch = false;
                break;
            }
        }

        // main diagonal
        boolean diagMatch = false;
        if (x == y) {
            diagMatch = true;
            for (int i = 0; i < n; i++) {
                if (board[i][i] == null || board[i][i].getPeice() != playingPeice.getPeice()) {
                    diagMatch = false;
                    break;
                }
            }
        }

        // anti-diagonal
        boolean antiDiagMatch = false;
        if (x + y == n - 1) {
            antiDiagMatch = true;
            for (int i = 0; i < n; i++) {
                if (board[i][n - i - 1] == null || board[i][n - i - 1].getPeice() != playingPeice.getPeice()) {
                    antiDiagMatch = false;
                    break;
                }
            }
        }

        return rowMatch || colMatch || diagMatch || antiDiagMatch;
    }
}
