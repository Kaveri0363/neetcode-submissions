// class Pair{
//     int row;
//     int col;
//     Pair(int row,int col){
//         this.row=row;
//         this.col=col;
//     }
// }
class Solution {
    
     public int bfs(int i,int j, int[][] grid, boolean[][] vis){
        vis[i][j]=true;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        int area=1;
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int row=curr[0];
            int col=curr[1];

            for(int k=0;k<4;k++){
            int nrow=row+drow[k];
            int ncol=col+dcol[k];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length &&
             vis[nrow][ncol]==false && grid[nrow][ncol]==1){
                vis[nrow][ncol]=true;
                area++;
                q.offer(new int[]{nrow,ncol});
             }
        }
        }
         return area;
        
    }
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        int area=0;
        int result=0;
            for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false && grid[i][j]==1){
                   area= bfs(i,j,grid,vis);
                }
                result=Math.max(result,area);
            }
        }

        return result;
    }
}
