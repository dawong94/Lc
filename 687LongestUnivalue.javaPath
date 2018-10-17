/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int maxi=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        helper(root,root.val);
        return maxi;
             
                
    }
    
    public int helper(TreeNode root, int prev){
        if(root == null) {return 0;}
        int lc = helper(root.left,root.val);
        int rc = helper(root.right,root.val);
        this.maxi = Math.max(maxi,lc+rc);
        int count=0;
        if(root.val == prev){
            count = 1+ Math.max(lc,rc);
        }
        
        
        return count;
        
             
        
    }
}