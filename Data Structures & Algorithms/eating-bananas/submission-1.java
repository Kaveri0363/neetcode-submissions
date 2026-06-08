class Solution {
    public int completeEating(int k, int[] piles){
        int total=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]<=k)
                total+=1;
            else if(piles[i]>k)
                total+=Math.ceil((double)piles[i]/k);
        }

        return total; 
    }
        
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;

         for(int pile : piles){
           maxPile = Math.max(maxPile, pile);
          }
        int l=1;
        int r=maxPile;
        int ans = maxPile;
        while(l<=r){
            int mid=l+(r-l)/2;
            int totalHr=completeEating(mid,piles);
            if(totalHr<=h){
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
        }

        return ans;
    }
    }
