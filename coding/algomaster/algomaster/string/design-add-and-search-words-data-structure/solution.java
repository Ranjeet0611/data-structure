class TrieNode{
  public TrieNode[] children;
  public boolean isEndWord;
  public TrieNode (){
      this.children = new TrieNode[26];
      this.isEndWord = false;
  }
}
class WordDictionary {
    private TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode current = root;
        for(char c:word.toCharArray()){
            TrieNode node = current.children[c-'a'];
            if(node==null){
                TrieNode newNode = new TrieNode();
                current.children[c-'a'] = newNode;
            }
            current = current.children[c-'a'];
        }
        current.isEndWord = true;
    }
    public boolean searchHelper(TrieNode root,String word,int index){
        if(root==null){
            return false;
        }
        if(word.length()==index){
            return root.isEndWord;
        }
        char ch = word.charAt(index);
        if(ch=='.'){
            for(int i=0;i<26;i++){
                if(root.children[i]!=null){
                    if(searchHelper(root.children[i],word,index+1))
                        return true;
                }
            }
        }
        else{
            return searchHelper(root.children[ch-'a'],word,index+1);
        }
        return false;
    }
    public boolean search(String word) {
        return searchHelper(root,word,0);
    }
}