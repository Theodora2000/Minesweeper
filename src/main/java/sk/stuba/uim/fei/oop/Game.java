package sk.stuba.uim.fei.oop;

public class Game {
    private Board board;

    Game(){
        this.board = new Board();
    }

    public void play(){
        System.out.println(this.board.draw());
    }
}
