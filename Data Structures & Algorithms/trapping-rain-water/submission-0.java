class Solution {
    public int trap(int[] heights) {
        int n=heights.length;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        leftMax[0]=0;
        int max=heights[0];
        
        for(int i=1;i<n;i++){
            leftMax[i]=max;
            max=Math.max(max,heights[i]);
        }
        max=heights[n-1];
        rightMax[n-1]=0;
         for(int i=n-2;i>=0;i--){
            rightMax[i]=max;
            max=Math.max(max,heights[i]);
        }
        //int[] minHeight=new int[];
        int area=0;
        for(int i=0;i<n;i++){
            int min=Math.min(rightMax[i],leftMax[i]);
            int minHeight=min-heights[i];
            if(minHeight>=0)
            area+=minHeight;
        }

        return area;
    }
}
