package Questions.TicTacToe.Service;

import Questions.TicTacToe.Models.*;


public class GamerRunner {
    PlayingPeiceO O=new PlayingPeiceO();
    PlayinPeiceX x =new PlayinPeiceX();
    Board board ;
    Player [] players;
    int board_size_row;
    int board_size_col;
    int current_player;


    public GamerRunner(int n){
        board_size_row=n;
//        board_size_col=m;
        board =new Board(n);
        players=new Player [2];
        players[0]=new Player("player 1",x);
        players[1]=new Player("player 2",O);
        current_player=0;

    }

   public void StartGame(){
        System.out.println("Player "+players[current_player].getName()+"Starts the game");

        while(true){
            int x=(int)(Math.random()*(board_size_row));
            int y =(int)(Math.random()*(board_size_row));

            if(board.validateMove(x,y)==false){
                continue;
            }

            System.out.println("Player" +players[current_player].getName()+" placed at " +x+" "+y+" "+players[current_player].getPeices().getPeice());



            board.updateBoard(x,y,players[current_player].getPeices());
            board.printBoard();
            if(board.isWinner(x,y,players[current_player].getPeices())){
                System.out.println("We have winner"+players[current_player].getName());
                break;
            }

            SwitchTurns();
            System.out.println("Player" +players[current_player].getName()+"is playing");
        }

        board.printBoard();
    }

    void SwitchTurns(){
        current_player++;

        if(current_player>=players.length){
            current_player=0;
        }
    }
}
