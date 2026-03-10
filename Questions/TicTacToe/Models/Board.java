package Questions.TicTacToe.Models;

public class Board {
    int n;
//    int m;
    PlayingPeice [][]board;

   public Board(int n){
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
                System.out.println(board[i][j]);
            }
        }
    }

    public boolean isWinner(int x,int y,PlayingPeice playingPeice){
       if(playingPeice==null){
           return false;
       }
       //1 rows
        boolean rowMatch=true;
        for(int i=0;i<n;i++){
                if(board[x][i].peiceType!=playingPeice.peiceType){
                         rowMatch=false;
                }
        }
        //1 cols
        boolean colMatch=true;
        for(int i=0;i<n;i++){
           if( board[i][y].peiceType!=playingPeice.peiceType){
               colMatch= false;
           }
        }
        //2 diagonals
        boolean diagMatch=true;
        for(int i=0;i<n;i++){
            if(board[i][i].peiceType!=playingPeice.peiceType){
                diagMatch= false;
            }
        }
        boolean antidiag=true;
     for(int i=0;i<n;i++){
         if(board[i][n-i-1].peiceType!=playingPeice.peiceType){
             antidiag =false;
         }
     }
       return rowMatch||colMatch||antidiag||diagMatch;
    }
}
