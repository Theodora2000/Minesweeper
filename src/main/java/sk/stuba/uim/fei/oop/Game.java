package sk.stuba.uim.fei.oop;

public class Game {
    private Board board;

    Game(){
        this.board = new Board();
    }

    public void play() {
        try {
            while (true) {
                System.out.println(this.board.draw());
                this.board.reveal(getNextMove());
            }
        } catch (MineRevealedException e) {
                System.out.println("mina");
            }
        }


    private Move getNextMove(){
        char row = Zklavesnice.readChar(String.format("Enter row (a-%s)%n",(char)('a'+Board.BOARD_SIZE - 1 )));
        int col = Zklavesnice.readInt(String.format("Enter column (1-%d)\n", Board.BOARD_SIZE - 1));
        return new Move(col, row);
    }
}
