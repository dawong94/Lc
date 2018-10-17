class Solution {
    public boolean isPalindrome(String s) {
        int l =0 , r = s.length()-1;
        
        while(l<r) {
 
            
            while(l<r&&!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            if(l>=r) {break;}
            while(r>l&&!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(r<= l) {break;}
            
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
            
            
        }
        return true;
        
        
        
        
    }
}