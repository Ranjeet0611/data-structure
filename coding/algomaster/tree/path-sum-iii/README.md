# Path Sum III

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/path-sum-iii) · **Difficulty:** Medium · **Language:** java

## Problem
Count paths in a binary tree where node values sum to a given target. Paths can start and end at any node, but must go downwards.

## Approach
The accepted solution uses a brute-force recursive strategy. It iterates through every node in the tree, treating each as a potential starting point for a path. For each starting node, it performs a Depth-First Search (DFS) downwards. This DFS checks all paths originating from that node, accumulating sums. If any path's sum matches the target, a global counter is incremented.

## Complexity
*   **Time:** O(N^2) in the worst case (e.g., a skewed tree). For each of N nodes, a DFS might visit O(N) nodes.
*   **Space:** O(H) due to recursion stack depth, where H is the height of the tree.

## Review
The solution correctly counts paths but has a critical flaw. Path sums can exceed `Integer.MAX_VALUE` (approx. 2 * 10^9) if node values are large and the path is long. The `targetSum` parameter in the `solve` helper function should be `long` to prevent integer overflow. The code is readable, but its O(N^2) efficiency is not optimal for larger trees.

## Improvements
1.  **Time Complexity Optimization:** An O(N) solution exists using prefix sums and a hash map. This significantly improves performance for larger trees.
2.  **Integer Overflow Fix:** Change the `targetSum` parameter in the `solve` helper function (and any internal sum calculations) from `int` to `long`. This prevents incorrect results when path sums exceed `Integer.MAX_VALUE`.

## Takeaways
*   **Brute-Force Tree Traversal:** A common pattern is to iterate all possible starting nodes and then explore paths from each. This often leads to O(N^2) complexity.
*   **Prefix Sum Technique:** This problem is a classic application of prefix sums, extended from arrays to trees.
*   **HashMap for Frequencies:** HashMaps are excellent for storing frequencies of prefix sums, allowing O(1) average-time lookups.
*   **DFS and Backtracking:** The optimized solution uses DFS. Backtracking (reverting state after visiting a subtree) is crucial for correct prefix sum calculations in trees.
*   **Integer Overflow Awareness:** Always consider potential integer overflow when summing values, especially with large inputs. Use `long` when necessary.

## Where it applies
This problem demonstrates patterns useful in many areas:

*   **Data Structures:** Binary Trees, HashMaps.
*   **Algorithms:** Depth-First Search (DFS), Prefix Sums.
*   **When to reach for them:** When you need to count or find paths, subsequences, or subarrays that sum to a target value or satisfy a cumulative property. This is common in hierarchical or sequential data analysis.
*   **Similar Problems:**
    *   Subarray Sum Equals K
    *   Binary Tree Maximum Path Sum
    *   Longest Path with Same Value
