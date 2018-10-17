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
    public TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if(t1 == null) return t2;
        if(t2== null) return t1;
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        TreeNode res = t1;
        st1.push(t1);
        st2.push(t2);
        
        while(!st1.empty()){
            TreeNode n1 = st1.pop();
            TreeNode n2 = st2.pop();
            n1.val += n2.val;
            if (n1.left != null&& n2.left!= null){          
                st1.push(n1.left);
                st2.push(n2.left);
                
            } else if (n1.left == null && n2.left != null){
                n1.left = n2.left;
            } 
            
            if (n1.right != null&& n2.right!= null){
                st1.push(n1.right);
                st2.push(n2.right);
            } else if (n1.right == null && n2.right != null){
                n1.right = n2.right;
                
            }
        }
        return res;
    }
    
    
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null){return t1 == null ? t2:t1;}
        t1.val+=t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;
        
        
    }
}