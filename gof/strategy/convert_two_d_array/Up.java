package gof.strategy.convert_two_d_array;

public class Up implements Movement{

    private TwoDArrayConverter converter;

    public Up(TwoDArrayConverter converter) {
        this.converter = converter;
    }

    @Override
    public void move(int i, int j, int[][] grid, int[] ansArray, boolean[][] isVisited) {
        int rows = grid.length;
        int cols = grid[0].length;
        int total = rows*cols;
        //update index for row
        while(i >= 0 && !isVisited[i][j]){
            ansArray[converter.getCurrIndex()] = grid[i][j];
            isVisited[i][j] = true;
            converter.setCurrIndex(converter.getCurrIndex()+1);
            i--;
        }

        if(this.converter.getCurrIndex() < total){
            converter.setCurrMovement(converter.getRight());
            converter.getCurrMovement().move(i+1, j, grid, ansArray, isVisited);
        }
    }
}
