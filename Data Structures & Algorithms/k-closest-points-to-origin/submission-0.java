class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int dist=0;
        PriorityQueue<int[]> pq =
            new PriorityQueue<>(
                (a,b) -> b[0] - a[0]
            );

        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            if(x==0 || y==0){
                if(x==0) 
                dist=y;
                else dist=x;
            }
            else{
                dist=x*x + y*y;
            }
            pq.offer(new int[]{dist,x,y});
            if(pq.size()>k) pq.poll();
        }

         int[][] ans = new int[k][2];

        for(int i=0;i<k;i++){
            int[] curr = pq.poll();
            ans[i][0] = curr[1];
            ans[i][1] = curr[2];
        }

        return ans;

    }
}
