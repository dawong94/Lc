public class Solution {
    /**
     * @param s: a string
     * @return: an integer
     */
    public int lengthOfLongestSubstring(String s) {
        // write your code here
        if ( s.length() == 0) return 0;
        int j=0;
        int maxi = -1;
        int[] map = new int[256];
        int n = s.length();
        for(int i =0; i< n ; i++){
            while(j < n && map[s.charAt(j)]==0) {
                map[s.charAt(j)] = 1;
                j++;
                
            }
            
            
            maxi = Math.max(maxi, j - i);
            
            
            map[s.charAt(i)] = 0;
            
        }
        
        return maxi;
    }
}