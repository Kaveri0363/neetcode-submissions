class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
    List<Integer>[] arr=new ArrayList[nums.length+1];
    int n=nums.length;
    
    for(int i=0;i<=n;i++){
            arr[i] = new ArrayList<>(); 
        }


    for(int a:map.keySet()){
        arr[map.get(a)].add(a);
    }

    int[] res=new int[k];
    int index=0;

    for(int i=arr.length-1;i>0 && index<k ;i--){
        for(int j:arr[i]){
            res[index++]=j;
            if(index==k)
            return res;
        }
    }
    return res;
    }
}
