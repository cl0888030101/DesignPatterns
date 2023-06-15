package gof.strategy.convert_two_d_array;

public interface Movement {
    void move(int i, int j, int[][] grid, int[] ansArray, boolean[][] isVisited);
}
