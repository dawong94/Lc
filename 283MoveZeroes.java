class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length >1) {
            int index =0;
            
            for(int val : nums) {
                if(val != 0) {
                    nums[index] = val;
                    index++;
                }
            }
            for(int j = index; j<nums.length;j++) {
                nums[j] =0;
            }
     
        }
        
    }
}