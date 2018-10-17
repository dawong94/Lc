class Solution {
    public int numIslands(char[][] grid) {
        int num = 0;
        for(int row =0;row < grid.length;row ++){
            for (int column=0; column < grid[row].length;column++){
                num += getnumber(grid, row, column);
            }
            
        }
        
        return num;
        
    }
    
    public int getnumber(char[][] grid, int row, int column){
        /*if(row <0 || column < 0 || row >= grid.length || column >= grid[row].length){
            return 0;
        }*/
        if(grid[row][column] == '0') {return 0;}
        clearIs(grid,row,column);
            
        return 1;    
        
        
    }
    
    public void clearIs(char[][] grid, int row, int column){
        if(row <0 || column < 0 || row >= grid.length || column >= grid[row].length){
            return;
        }
        if(grid[row][column] == '0') {return;}
        grid[row][column] = '0';
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        for (int k =0; k< 4;k++){
            clearIs(grid, row + dx[k], column + dy[k]);
        }
        
    }
}