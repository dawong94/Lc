/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "#";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null){
                sb.append("#,");
                continue;
            }
            sb.append(node.val + ",");
            q.add(node.left);
            q.add(node.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "#") return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] vals = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        q.add(root);
        for (int i = 1; i < vals.length; i++) {
            TreeNode node = q.poll();
            if(!vals[i].equals("#")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                q.add(node.left);
            }
            if(!vals[++i].equals("#")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                q.add(node.right);
            }   
        }
        
        return root;
    }

}


