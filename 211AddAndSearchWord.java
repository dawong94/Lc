class TrieNode {
    char c;
    boolean hasWord;
    Map<Character, TrieNode> children = new HashMap<>();
    
    public TrieNode() {
    }
    
    public TrieNode(char c) {
        this.c = c;
    }
}

public class WordDictionary {
    TrieNode root = new TrieNode();
    /*
     * @param word: Adds a word into the data structure.
     * @return: nothing
     */
    public void addWord(String word) {
        // write your code here
        TrieNode node = root;
        for (int i=0; i < word.length();i++) {
            char letter = word.charAt(i);
            if (node.children.containsKey(letter)) {
                node = node.children.get(letter);
            } else {
                TrieNode child = new TrieNode();
                node.children.put(letter, child);
                node = child;
            }
        }
        node.hasWord = true;
    }

    /*
     * @param word: A word could contain the dot character '.' to represent any one letter.
     * @return: if the word is in the data structure.
     */
    public boolean search(String word) {
        // write your code here
        TrieNode node = root;
        for (int i = 0; i< word.length(); i++ ){
            char c = word.charAt(i);
            if( c == '.'){
                for (char child : node.children.keySet()) {
                    if(search(word.substring(0,i) + child + word.substring(i+1)) ){
                        return true;
                    } 
                }
                return false;
            } else if(node.children.containsKey(c)) {
                node = node.children.get(c);
                
            } else {
                return false;
            }
            
            
        }
        return node.hasWord;
    }
}