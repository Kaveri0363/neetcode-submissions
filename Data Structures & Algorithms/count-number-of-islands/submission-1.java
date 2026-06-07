class Solution {
    public void dfs(int i,int j, char[][] grid, boolean[][] vis){
        vis[i][j]=true;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        for(int k=0;k<4;k++){
            int nrow=i+drow[k];
            int ncol=j+dcol[k];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length &&
             vis[nrow][ncol]==false && grid[nrow][ncol]=='1'){
                vis[nrow][ncol]=true;
                dfs(nrow,ncol,grid,vis);
             }
        }
    }
    public int numIslands(char[][] grid) {
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
            for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false && grid[i][j]=='1'){
                    dfs(i,j,grid,vis);
                    count++;
                }
            }
        }

        return count;
    }
}
