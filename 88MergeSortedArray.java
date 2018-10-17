class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int leftbound1 = 0;
        int leftbound2 = 0;
        int rightbound1 = m-1;
        int rightbound2 = n-1;
        int index = 0;
        while(leftbound1 <= rightbound1 && leftbound2 <= rightbound2){
            if(nums1[leftbound1] <= nums2[leftbound2]){
                res[index++] = nums1[leftbound1++];
            }else {
                res[index++] = nums2[leftbound2++];
            }
            
        }
        
        while(leftbound1 <= rightbound1){
            res[index++] = nums1[leftbound1++];            
        }
        while(leftbound2 <= rightbound2){
            res[index++] = nums2[leftbound2++];            
        }
        
        for (int i =0;i< m+n; i++ ){
            nums1[i] = res[i];
        }
        


        
    }
}