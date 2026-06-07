class KthLargest {
    PriorityQueue<Integer> pq= new PriorityQueue<>();
    int k;
    int nums[];
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.nums=nums;
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
            if(pq.size()>k) pq.poll();
        }  
    }

    
    public int add(int val) {
        
        pq.offer(val);
        if(pq.size()>k) pq.poll();
        return pq.peek();
    }
}
