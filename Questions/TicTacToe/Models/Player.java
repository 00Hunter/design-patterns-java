package Questions.TicTacToe.Models;

public class Player {
    String name;
    PlayingPeice peices;

    public Player(String name,PlayingPeice peice){
        this.name=name;
        this.peices=peice;
    }

    public String getName(){
        return this.name;
    }

    public PlayingPeice getPeices() {
        return peices;
    }
}
