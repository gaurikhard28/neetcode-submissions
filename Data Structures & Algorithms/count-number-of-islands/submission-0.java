class Solution {
    public int numIslands(char[][] grid) {
        int n= grid.length;
        int m=grid[0].length;
        int[][] visited =new int[n][m];
        int is =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'&& visited[i][j]==0){
                is++;
                numIsland(i,j,grid,visited);
            }
            }
        }
        return is;
    }
    public void numIsland(int n ,int m,char[][] grid,int[][] visited) {
          if(n<0||n>grid.length-1) return;
          if(m<0||m>grid[0].length-1) return;
          if(grid[n][m] == '0' || visited[n][m]==1) return;
          visited[n][m]=1;
          
          numIsland(n-1,m,grid,visited);
          numIsland(n+1,m,grid,visited);
          numIsland(n,m+1,grid,visited);
          numIsland(n,m-1,grid,visited);
    }
}
