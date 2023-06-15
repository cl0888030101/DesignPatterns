package gof.strategy.convert_two_d_array;

public class TwoDArrayConverter {

    private final Movement left;
    private final  Movement right;
    private final  Movement up;
    private final Movement down;

    private Movement currMovement;
    private int currIndex;

    public TwoDArrayConverter() {
        left = new Left(this);
        right = new Right(this);
        up = new Up(this);
        down = new Down(this);
        this.currMovement = right;
        this.currIndex = 0;
    }

    int[] convert(int[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;
        int[] ansArray = new int[rows*cols];
        boolean[][] isVisited = new boolean[rows][cols];
        this.currMovement.move(0, 0, grid, ansArray, isVisited);
        reset();
        return ansArray;
    }

    private void reset(){
        currMovement = right;
        currIndex = 0;
    }

    public Movement getCurrMovement() {
        return currMovement;
    }

    public void setCurrMovement(Movement currMovement) {
        this.currMovement = currMovement;
    }

    public int getCurrIndex() {
        return currIndex;
    }

    public void setCurrIndex(int currIndex) {
        this.currIndex = currIndex;
    }

    public Movement getLeft() {
        return left;
    }

    public Movement getRight() {
        return right;
    }

    public Movement getUp() {
        return up;
    }

    public Movement getDown() {
        return down;
    }
}
