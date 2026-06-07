class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        //int maxFreq = 0;
        for(char task : tasks){
            freq[task - 'A']++;
           }
           PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
           Queue<int[]> cooldown=new LinkedList<>();

        for(int f : freq){
            if(f>0)
            maxHeap.offer(f);
        }
        int time=0;
        while(!maxHeap.isEmpty() || !cooldown.isEmpty()){
            time++;
            if(!cooldown.isEmpty() && cooldown.peek()[1]==time){
                maxHeap.offer(cooldown.poll()[0]);
            }

            if(!maxHeap.isEmpty()){
                int count=maxHeap.poll();
                count--;
                if(count>0){
                    cooldown.offer(new int[]{count,time+n+1});
                }
            }
        }

        return time;
        //  int slots =
        //     (maxFreq - 1) * (n + 1) + maxCount;
        // return Math.max(tasks.length, slots);
    }
}
