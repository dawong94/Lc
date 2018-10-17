class Codec {
public:

    // Encodes a tree to a single string.
    string serialize(TreeNode* root) {
        if (!root) return "#";
        return to_string(root->val) + "," + serialize(root->left)+ ","+ serialize(root->right);
        
        
    }

    // Decodes your encoded data to tree.
    TreeNode* deserialize(string data) {
       TreeNode* root = helper(data);
        return root;
        
    }
    
    TreeNode* helper(string& data) {
        if (data[0] == '#'){
            if (data.size()>1) {
                data = data.substr(2);
            }
            return NULL;
        }
        TreeNode* node = new TreeNode(getVal(data));
        node->left = helper (data);
        node->right = helper(data);
        return node;   
    }
    
    int getVal(string& data){
        int pos = data.find(',');
        int val = stoi(data.substr(0,pos));
        data = data.substr(pos+1);
        return val;    
    }
    
    
};

