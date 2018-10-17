class TrieNode {
    char c;
    boolean hasWord;
    Map<Character, TrieNode> children;
    
    public TrieNode() {
        children = new HashMap<>();
    }
    

}

public class Trie {
    private TrieNode root;
    public Trie() {
        // do intialization if necessary
       this.root = new TrieNode();
    }

    /*
     * @param word: a word
     * @return: nothing
     */
    public void insert(String word) {
         TrieNode curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!curr.children.containsKey(c)) {
                curr.children.put(c, new TrieNode());
            }
            curr = curr.children.get(c);
        }
        curr.hasWord = true;
    }

    /*
     * @param word: A string
     * @return: if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode node = root;
         
        for (int i=0; i< word.length(); i++) {
            char c = word.charAt(i);
            if (!node.children.containsKey(c)){
                return false;
            }
            node = node.children.get(c);
        }
        return node.hasWord;
        // write your code here
    }

    /*
     * @param prefix: A string
     * @return: if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
       TrieNode curr = this.root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (!curr.children.containsKey(c)) {
                return false;
            }
            curr = curr.children.get(c);
        }
        return true;
    
    }
    
}