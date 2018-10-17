class Solution {
    public boolean isSymmetric1(TreeNode root) {
        return jingzi(root,root);
    }
    
    public boolean jingzi(TreeNode root1,TreeNode root2){
        if(root1 == null && root1 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        boolean l = jingzi(root1.left,root2.right);
        boolean r = jingzi(root1.right,root2.left);

        return (root2.val == root1.val) && l && r;
        
        
    }
    
    
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode l = q.poll();
            TreeNode r = q.poll();
            
            if(l== null && r == null) {continue;}
            if(l== null || r == null) return false;
            if(l.val != r.val){return false;}
            q.add(l.right);
            q.add(r.left);
            q.add(l.left);
            q.add(r.right);

        }
        
        return true;
    }
}