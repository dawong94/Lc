class Solution {
    public boolean validPalindrome(String s) {
        if(s.length() == 1 || s.length() == 0){return true;}
        int r = s.length()-1, l =0;
        int k = 1;
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)){
            
                boolean left = helper(s,l+1,r);
                boolean right = helper(s,l,r-1);                    
                return left == true ? true:right; //al long as one of them is true.                    
                              
            }
            l++;
            r--;                        
        }
        return true;      
    }
    
    public boolean helper(String s, int l, int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
}