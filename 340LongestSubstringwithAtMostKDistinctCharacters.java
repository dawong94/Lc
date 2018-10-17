class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int maxi = 0;
        if (s.length()==0 || k == 0) return 0;
        if(s.length() == 1 && k>= s.length()) return 1;
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int j =0;
        for (int i =0; i < s.length();i++){
            while(j < s.length()){
                char c = s.charAt(j);
                if(map.containsKey(c)){
                    map.put(c, map.get(c) + 1);
                } else {
                    if(map.size() == k){
                        break;
                    }
                    map.put(c,1);
                    
                }
                j++;
                
            }
            maxi = Math.max(j-i, maxi);
            char cc = s.charAt(i);
            
            if(map.get(cc) <=1) {
                map.remove(cc);
            }else {
                map.put(cc,map.get(cc) -1);
            }
            
        }
        return maxi;
        
    }
}