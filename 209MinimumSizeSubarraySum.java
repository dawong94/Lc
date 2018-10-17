class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        
        int j =0, summ = 0;
        int mini = nums.length+1;
        for(int i=0; i < nums.length;i++) {
            while (j < nums.length && summ < s){
                summ += nums[j];
                j++;
            }
            
            if (summ >= s){
                mini = Math.min(j-i, mini);
            }
            
            summ = summ - nums[i];
            
            
        }
        
        if (mini == nums.length+1 ){mini = 0;}
        return mini;
        
        
        
        
    }
}