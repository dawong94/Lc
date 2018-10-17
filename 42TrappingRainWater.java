class Solution {
    public int trap(int[] height) {
        if (height.length == 0) return 0;
        int left = 0;
        int right = height.length - 1;
        int left_max = height[0];
        int right_max = height[right];
        int water = 0;
        while (left <= right) {
            if (left_max < right_max) {
                if (left_max < height[left]) {
                    left_max = height[left];
                } else {
                    water+= left_max - height[left];
                }
                left++;
                
            }else {
                if (right_max < height[right]){
                    right_max = height[right];
                }else {
                    water += right_max - height[right];
                }
                right--;
            }
        }
        
        return water;
        
    }
}