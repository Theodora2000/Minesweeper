package sk.stuba.uim.fei.oop;

import java.util.ArrayList;
import java.util.List;

public class Empty extends Tile {

    private int nearbyMines;

    private List<Tile> orthogonalNeighbours;

    public Empty() {
        this.nearbyMines = 0;
        this.orthogonalNeighbours = new ArrayList<>();
    }

    @Override
    public void reveal() throws MineRevealedException {
        boolean waHidden = !this.isRevealed();
        super.reveal();
        if(this.nearbyMines == 0 && waHidden){
            for(Tile t : this.orthogonalNeighbours){
                t.reveal();
            }
        }

    }

    @Override
    protected String drawRevealed() {
        if(nearbyMines==0){
            return ".";
        }
        return nearbyMines+ "";
    }

    public void addOrthogonalNeighbours(List<Tile> neighbours){
        this.orthogonalNeighbours.addAll(neighbours);
        this.checkNeighboursForMines(neighbours);
    }

    public void addDiagonalNeighbours(List<Tile> neighbours){

    }

    private void checkNeighboursForMines(List<Tile> neighbours){
        neighbours.forEach(tile  ->{
            if(tile instanceof Mine){
                this.nearbyMines++;
            }
        });
    }
}
