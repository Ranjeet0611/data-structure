class TrieNode{
  public TrieNode[] children;
  public boolean isEndWord;
  public TrieNode (){
      this.children = new TrieNode[26];
      this.isEndWord = false;
  }
}
class Solution {
     public void addWord(TrieNode root,String product){
        TrieNode current = root;
        for(char ch:product.toCharArray()){
            TrieNode node = current.children[ch-'a'];
            if(node==null){
                current.children[ch-'a'] = new TrieNode();
            }
            current = current.children[ch-'a'];
        }
        current.isEndWord = true;
    }
    public void collectSuggestions(TrieNode current,String prefix,List<String> suggestions) {
            if(suggestions.size()==3){
                return;
            }
            if(current.isEndWord){
                suggestions.add(prefix);
            }
            for(int i=0;i<26;i++){
                char ch = (char) (i+'a');
                if(current.children[ch-'a']!=null){
                    collectSuggestions(current.children[ch-'a'], prefix+ch, suggestions);
                }
            }
    }
    public List<String> getSuggestions(TrieNode root, String prefix) {
        TrieNode current = root;
        for(char c:prefix.toCharArray()){
            if(current.children[c-'a']==null){
                return new ArrayList<>();
            }
            current  = current.children[c-'a'];
        }
        List<String> suggestions = new ArrayList<>();
        collectSuggestions(current, prefix, suggestions);
        return suggestions;
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TrieNode root = new TrieNode();
        for (String product : products) {
            addWord(root, product);
        }
        List<List<String>> result = new ArrayList<>();
        String prefix = "";
        for(char c:searchWord.toCharArray()){
            prefix +=c;
            result.add(getSuggestions(root,prefix));
        }
        return result;
    }
}