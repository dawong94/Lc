class Solution {

    public Node treeToDoublyList(Node root) {
        if(root == null){
            return null;
        }
        resultType res = helper(root);
        res.head.left = res.tail;
        res.tail.right = res.head;
        
        return res.head;
    }
    
    public resultType helper (Node root) {
        if(root == null){
            return null;
        }
        resultType left = helper(root.left);
        resultType right = helper(root.right);
        Node node = new Node(root.val);

        resultType result = new resultType(null,null);
        if(left == null) {
            result.head = node;
        } else {
            result.head = left.head;
            left.tail.right = node;
            node.left = left.tail;
            
        }
        if(right == null) {
            result.tail = node;
        } else {
            result.tail = right.tail;
            right.head.left = node;
            node.right = right.head;
        }
        
        return result;      
        
    }
}