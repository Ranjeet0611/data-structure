# Word Search II

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/word-search-ii) · **Difficulty:** Hard · **Language:** java

## Problem
Given a 2D board of characters and a list of words, find all words present on the grid. Words must be formed from sequentially adjacent cells.

## Approach
The accepted solution uses a Trie combined with Depth-First Search and backtracking. All target words are inserted into a Trie. The algorithm then iterates through every grid cell to run a DFS. It prunes invalid paths early if prefixes do not exist in the Trie.

## Complexity
Time Complexity: $O(M \cdot N \cdot 4^L)$, where $M$ and $N$ are board dimensions and $L$ is max word length. 
Space Complexity: $O(K \cdot L)$ for the Trie, where $K$ is the number of words.

## Review
The core pattern is correct and efficient. However, the current implementation uses string concatenation during recursion and a result Set for de-duplication. This creates unnecessary object overhead and memory allocations.

## Improvements
Store the complete word string directly inside the TrieNode during insertion. When a valid word is reached in the DFS, add it to the results and clear the node's word reference to prevent duplicates. This avoids string concatenation and removes the need for a result Set.

## Takeaways
1. Combining a Trie with DFS is the gold standard for multi-pattern grid searches.
2. Storing terminal strings directly in Trie nodes avoids costly string allocations.
3. In-place board marking with sentinel characters beats maintaining a separate visited array.

## Where it applies
This pattern uses Tries and Backtracking with DFS. Reach for it when searching for multiple dictionary words inside a text matrix or grid. It solves problems like Boggle Game, autocomplete engines, and prefix-based routing lookups.
