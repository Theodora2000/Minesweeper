package sk.stuba.uim.fei.oop;

public class Empty extends Tile {
    @Override
    protected String drawRevealed() {
        return ".";
    }
}
