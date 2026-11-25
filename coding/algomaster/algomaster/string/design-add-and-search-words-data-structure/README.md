# Design Add and Search Words Data Structure

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/design-add-and-search-words-data-structure) · **Difficulty:** Medium · **Language:** java

## Problem
Design a data structure that supports adding new words and searching for existing words with wildcard support.

## Approach
The accepted solution uses a Trie combined with Depth-First Search and backtracking. Words are inserted sequentially into the Trie. The search function handles regular characters by traversing child nodes and uses recursion to branch across all 26 possible children when encountering a dot wildcard.

## Complexity
Time Complexity: O(M) for `addWord`, and up to O(26^M) in the worst-case wildcard search where M is word length. Space Complexity: O(M * N) to store the nodes, where N is the number of words.

## Review
The implementation is clean, well-structured, and idiomatic for Java. It correctly separates the TrieNode definition from the dictionary logic and handles wildcard branches cleanly.

## Improvements
The accepted solution is already a good one and is optimal for the problem constraints.

## Takeaways
Tries are exceptionally efficient for prefix-based string matching and dictionary implementations. Combining Tries with recursive DFS enables handling wildcard queries like dots efficiently.

## Where it applies
Data structures: Tries, Prefix Trees, and DFS with backtracking. 

When to reach for it: Use this pattern when dealing with dynamic dictionary lookups, prefix validation, and pattern matching with wildcards.

Similar problems:
- Implement Trie (Prefix Tree)
- Word Search II
- Replace Words
