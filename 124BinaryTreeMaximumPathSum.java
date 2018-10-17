class Solution {
    int maxi;
    public int maxPathSum(TreeNode root) {
        
        maxi = root.val;
        helper(root);
        return maxi;
    }
    
    public int  helper(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = Math.max(0,helper(root.left));
        int right = Math.max(0,helper(root.right));
        int sum = root.val + left + right;
        this.maxi = Math.max(sum, this.maxi);
        return Math.max(left,right) + root.val;
    }
}