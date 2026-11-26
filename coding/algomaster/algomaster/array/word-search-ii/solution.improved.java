class TrieNode {
    public TrieNode[] children = new TrieNode[26];
    public String word = null;
}

class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (String w : words) {
            TrieNode current = root;
            for (char c : w.toCharArray()) {
                int idx = c - 'a';
                if (current.children[idx] == null) {
                    current.children[idx] = new TrieNode();
                }
                current = current.children[idx];
            }
            current.word = w;
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, result);
            }
        }
        return result;
    }

    private void dfs(char[][] board, int i, int j, TrieNode p, List<String> result) {
        char c = board[i][j];
        if (c == '#' || p.children[c - 'a'] == null) return;
        p = p.children[c - 'a'];
        if (p.word != null) {
            result.add(p.word);
            p.word = null; // De-duplicate
        }

        board[i][j] = '#'; // Mark as visited in-place
        if (i > 0) dfs(board, i - 1, j, p, result);
        if (j > 0) dfs(board, i, j - 1, p, result);
        if (i < board.length - 1) dfs(board, i + 1, j, p, result);
        if (j < board[0].length - 1) dfs(board, i, j + 1, p, result);
        board[i][j] = c; // Restore
    }
}