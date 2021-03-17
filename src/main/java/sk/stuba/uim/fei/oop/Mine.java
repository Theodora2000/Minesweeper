package sk.stuba.uim.fei.oop;

public class Mine extends Tile {

    @Override
    protected String drawRevealed() {
        return "*";
    }

    @Override
    public void reveal() throws MineRevealedException{
        super.reveal();
        throw new MineRevealedException();
    }
}
