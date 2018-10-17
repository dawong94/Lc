class ResultType {
    public boolean isBalanced;
    public int maxDepth;
    public ResultType(boolean isBalanced, int maxDepth) {
        this.isBalanced = isBalanced;
        this.maxDepth = maxDepth;
    }
}

class Solution {
    //private boolean bst = true;
    private static int NOTBALANCED = -1;
    
    public boolean isBalanced1(TreeNode root) {
        int res = dfs(root);
        return res == -1? false:true;
        
    }
    
    private int dfs(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(left == NOTBALANCED|| right == NOTBALANCED||
           Math.abs(left - right) > 1){
            //this.bst = false;
            return -1;
        }
        return Math.max(left,right) +1 ;
    }
    public boolean isBalanced(TreeNode root) {
        ResultType res = helper(root);
        return res.isBalanced;
        
    }
    
    private ResultType helper(TreeNode root) {
        if(root == null) {
            return new ResultType(true,0);
        }
        
        ResultType left = helper(root.left);
         ResultType right = helper(root.right);
        if(left.isBalanced == false || right.isBalanced == false ) {
            return new ResultType(false,-1);
        }
        if(Math.abs(left.maxDepth - right.maxDepth) > 1){
            return new ResultType(false,-1);
        }
        
        return new ResultType(true, Math.max(left.maxDepth ,right.maxDepth)+1);


    }
}