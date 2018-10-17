public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: an integer
     * @return: an integer
     */
    public int twoSum5(int[] nums, int target) {
        // write your code here
        if(nums.length == 0) return 0;
        int l = 0;
        int r = nums.length-1;
        Arrays.sort(nums);
        int count = 0;
        int summ=0;
        while(l < r){
            summ = nums[l] + nums[r];
            if (summ > target) {
                r--;
            }else {
                count += r-l;
                l++;
            }
        }
        
        return count;
        
        
        
    }
}