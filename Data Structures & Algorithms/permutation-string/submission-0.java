class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] hash1= new int[26];
        int[] hash2=new int[26];
        for(int i=0;i<s1.length();i++){
            hash1[s1.charAt(i)-'a']++;
            hash2[s2.charAt(i)-'a']++;
        }
        int l=0;
        int r=s1.length()-1;

        while(r<s2.length()){
           if (Arrays.equals(hash1, hash2)) {
                return true;
            }
          r++;
          if(r<s2.length()){
            hash2[s2.charAt(r)-'a']++;
            hash2[s2.charAt(l)-'a']--;
            l++;
          }
        }
        return false;
    }
}
