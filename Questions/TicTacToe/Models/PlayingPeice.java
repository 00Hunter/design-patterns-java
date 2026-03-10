package Questions.TicTacToe.Models;

public class PlayingPeice {
    PeiceType peiceType;

    PlayingPeice(PeiceType peiceType){
       this.peiceType=peiceType;
    }

    public PeiceType getPeice(){
        return this.peiceType;
    }
}
