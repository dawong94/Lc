class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int lmax = 0;
        int rmax = 0;
        int res= 0;
        
        while(left < right) {
            if(height[left] < height[right]){
                lmax = Math.max(lmax,height[left]);
                res += lmax - height[left];
                left++;
            }else {
                rmax = Math.max(rmax,height[right]);
                res += rmax - height[right];
                right--;
            }         
            
        }
        
        return res;
        
    }
}
