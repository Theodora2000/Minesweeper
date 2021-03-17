package sk.stuba.uim.fei.oop;

public abstract class Tile {

    private boolean revealed;

    public Tile() {
        this.revealed = false;
    }

    public String draw() {
        if (!revealed) {
            return "#";
        }
        return drawRevealed();
    }

    protected abstract String drawRevealed();

    public void reveal() throws MineRevealedException {
        this.revealed = true;
    }

    public boolean isRevealed() {
        return revealed;
    }
}