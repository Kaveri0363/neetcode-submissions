class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        if(n==1){
            return new int[]{};
        }
        int[] prefix= new int[n];
        int[] postfix= new int[n];
        prefix[0]=1;
        postfix[n-1]=1;
        int res=1*nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=res;
             res=nums[i]*res;
        }
        res=1*nums[n-1];
        for(int i=n-2;i>=0;i--){
          postfix[i]=res;
          res=nums[i]*res;
        }
        for(int i=0;i<n;i++){
            postfix[i]*=prefix[i];
        }
        return postfix;
        
    }
}  
