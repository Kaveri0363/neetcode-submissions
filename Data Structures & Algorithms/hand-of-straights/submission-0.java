class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0)
            return false;
         TreeMap<Integer,Integer> map = new TreeMap<>();
         for(int card : hand)
            map.put(card,
                map.getOrDefault(card,0)+1);
        
        while(!map.isEmpty()){
             int start = map.firstKey();
             map.put(start,map.get(start)-1);
             if(map.get(start)==0) 
                map.remove(start);
             for(int i=1;i<groupSize;i++){
                    start++;
                    if(!map.containsKey(start)) 
                       return false;
                    map.put(start,map.get(start)-1);
                    if(map.get(start)==0) 
                       map.remove(start);
             }
        }

        return true;
    }
}
