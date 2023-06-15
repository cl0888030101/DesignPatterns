package gof.strategy.convert_two_d_array;

public class Right implements Movement{
    private TwoDArrayConverter converter;

    public Right(TwoDArrayConverter converter) {
        this.converter = converter;
    }

    @Override
    public void move(int i, int j, int[][] grid, int[] ansArray, boolean[][] isVisited) {
        int rows = grid.length;
        int cols = grid[0].length;
        int total = rows*cols;
        //move index for col
        while(j < cols && !isVisited[i][j]){
            ansArray[converter.getCurrIndex()] = grid[i][j];
            isVisited[i][j] = true;
            converter.setCurrIndex(converter.getCurrIndex()+1);
            j++;
        }
        if(converter.getCurrIndex() < total){
            converter.setCurrMovement(converter.getUp());
            converter.getCurrMovement().move(i, j-1, grid, ansArray, isVisited);
        }
    }
}
