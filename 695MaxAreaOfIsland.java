class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxRegion = 0;
        for (int row= 0; row < grid.length;row++){
            for (int column =0; column < grid[row].length; column++) {
                if(grid[row][column] == 1){
                    int size = getRegionSize(grid, row, column);
                    maxRegion = Math.max(size, maxRegion);
                }
            }
        }
        return maxRegion;
        
    }
    
    
    public int getRegionSize(int[][] grid, int row, int column) {
        if(row<0 || column < 0 || row >= grid.length || column >= grid[row].length){
            return 0;   
        }
        if(grid[row][column] == 0) {
            return 0;
        }        
        grid[row][column] = 0;
        int size = 1;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        for (int k = 0; k < 4; k++) {
            size += getRegionSize(grid, row + dx[k], column + dy[k]);
        }
        
        
        /*for(int r = row-1; r <= row+1; r++) {
            for(int c = column -1; c <= column +1; c++){
                if(r!= row || c != column){
                    size +=getRegionSize(grid,r,c);
                }
            }
        }*/
        return size ;
    }
}