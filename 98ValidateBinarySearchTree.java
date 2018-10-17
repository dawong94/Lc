public class resultType {
    int max;
    int min;
    boolean isVaild;
    public resultType(int min,int max,boolean isVaild) {
        this.min = min;
        this.max = max;
        this.isVaild = isVaild;
        
    }
}
class Solution {
    public int  MAX = Integer.MAX_VALUE;
    public int  MIN = Integer.MIN_VALUE;


    public boolean isValidBST(TreeNode root) {
        resultType res = helper(root);
        return res.isVaild;
    }
    
    public resultType helper(TreeNode root) {
        if (root == null){
            return new resultType(MAX,MIN,true);
        }
        
        resultType left = helper(root.left);
        resultType right = helper(root.right);
        if(left.isVaild == false || right.isVaild == false) {
            return new resultType(-1,-1,false);
        }
        if (root.left != null &&root.val <= left.max ||
            root.right != null && root.val >= right.min){
            return new resultType(-1,-1,false);
        }
        
        return new resultType(Math.min(left.min,root.val),Math.max(right.max,root.val),true);        
        
        
    }
}