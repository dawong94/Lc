class Solution {
    public int singleNumber1(int[] nums) {
        //time ccomplexity O(n*1), space com o(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            }
            else {
                map.remove(nums[i]);
            }
        }
        //set<Integer> keys = map.keySet();
        return (int)map.keySet().toArray()[0];
        
        
        
    }
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i =0;i< nums.length;i++) {
            a ^= nums[i];
        }
        
        return a;
    }
        


    
    
}