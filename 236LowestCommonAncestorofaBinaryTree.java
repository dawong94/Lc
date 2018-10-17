class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode l = helper(root.left,p,q);
        TreeNode r = helper(root.right,p,q);
        

        if (l != null && r != null) {
            return root;
        }
        return r == null? l:r;
        
    }
     
}