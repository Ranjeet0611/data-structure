# Search Suggestions System

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/search-suggestions-system) · **Difficulty:** Medium · **Language:** java

## Problem
Return up to three lexicographical product suggestions after each character of a search word is typed.

## Approach
Insert all products into a Trie data structure. Traverse the Trie for each character of the search word and collect up to three matching suggestions.

## Complexity
Time: O(N * M + S * (M + K)). Space: O(N * M). N is products, M is product length, S is search word length, K is suggestions.

## Review
The Trie implementation is clean and correct. Lexicographical order is naturally preserved by iterating children from 'a' to 'z'.

## Improvements
Cache the top 3 sorted suggestions directly inside each TrieNode during insertion. This avoids runtime DFS traversal. Alternatively, sort the products array and use binary search.

## Takeaways
1. Tries excel at prefix-matching. Pre-computing node results drastically improves query time.
2. Sorting and binary search provide a lightweight alternative to Tries for static datasets.

## Where it applies
Tries and prefix-matching patterns are used for autocomplete systems, search engine suggestions, and spell checkers. Similar problems include Implement Trie (Prefix Tree), Word Search II, and Replace Words.
