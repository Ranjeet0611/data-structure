class TrieNode{
  public TrieNode[] children;
  public boolean isEndWord;
  public TrieNode (){
      this.children = new TrieNode[26];
      this.isEndWord = false;
  }
}
class Solution {
    public void search(char[][] board,int i,int j,boolean[][] visited,Set<String> result,TrieNode current,String word){
        if(i>=board.length || i<0 || j>=board[0].length || j<0 || visited[i][j] || current.children[board[i][j]-'a']==null){
            return;
        }
        visited[i][j] = true;
        current = current.children[board[i][j]-'a'];
        if(current.isEndWord){
            result.add(word+board[i][j]);
        }
        search(board,i+1,j,visited,result,current,word+board[i][j]);
        search(board,i-1,j,visited,result,current,word+board[i][j]);
        search(board,i,j+1,visited,result,current,word+board[i][j]);
        search(board,i,j-1,visited,result,current,word+board[i][j]);
        visited[i][j] = false;
    }
    public void addToTrie(TrieNode root,String word){
        TrieNode current = root;
        for(char ch:word.toCharArray()){
            if(current.children[ch-'a']==null){
                current.children[ch-'a'] = new TrieNode();
            }
            current = current.children[ch-'a'];
        }
        current.isEndWord = true;
    }
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for(String word:words){
            addToTrie(root,word);
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        Set<String> result = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(root.children[board[i][j]-'a']!=null){
                    search(board,i,j,visited,result,root,"");
                }
            }
        }
        return result.stream().toList();
    }
}