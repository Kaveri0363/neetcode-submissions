class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int max=0;
        int i=0;
        int j=0;
        while(j<n && i<n){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
         max=Math.max(max,j-i+1);
         map.put(s.charAt(j),j);
          j++;
        }

        return max; 
    }
}
