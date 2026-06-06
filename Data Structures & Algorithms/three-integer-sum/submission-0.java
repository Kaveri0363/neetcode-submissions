class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list= new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            if(i!=0 && nums[i]==nums[i-1])
            continue;
            while(l<r){
                int sum= nums[i]+nums[l]+nums[r];
                if(l!=i+1 && nums[l]==nums[l-1]){
                    l++;
                    continue;
                }
                 if(r!=nums.length-1 && nums[r]==nums[r+1]){
                    r--;
                    continue;
                }
               if(sum == 0){
                 list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                 l++;
                 r--;
                }
                else if(sum>0) r--;
                else l++; 
            }
        }

        return list;
    }
}
