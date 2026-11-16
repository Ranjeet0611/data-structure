# Binary Tree Right Side View

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/binary-tree-right-side-view) · **Difficulty:** Medium · **Language:** java

## Problem
Find the values of the nodes visible from the right side of a binary tree.

## Approach
The accepted solution uses Breadth-First Search (BFS). It performs a level-order traversal. A queue processes nodes level by level. For each level, the last node processed is the rightmost node. Its value is added to the result.

## Complexity
**Time:** O(N), where N is the number of nodes. Each node is visited once.
**Space:** O(W), where W is the maximum width of the tree. In the worst case (a complete tree), this can be O(N).

## Review
The solution is clear and well-structured. It correctly implements the BFS approach. Edge cases, like an empty tree, are handled gracefully. Using `queue.size()` to delineate levels is a standard and effective pattern. Variable names are descriptive, enhancing readability.

## Improvements
The accepted BFS solution is already optimal. It achieves O(N) time complexity. No significant algorithmic improvements are necessary for the BFS approach. An alternative, equally optimal approach using Depth-First Search (DFS) also exists. DFS can solve this in O(N) time by prioritizing right child traversal and tracking depth.

## Takeaways
*   **BFS for Level-Order Traversal**: Use a queue to process nodes level by level.
*   **Identifying Level Boundaries**: `queue.size()` helps process nodes for the current level distinctly.
*   **Rightmost Node Logic (BFS)**: The last node polled within a level's iteration is the rightmost.
*   **Alternative DFS Approach**: DFS can also work by traversing right first and tracking depth.
*   **Time and Space Complexity**: Both BFS and DFS are O(N) time. BFS is O(W) space, DFS is O(H) space. Both can be O(N) in worst cases.

## Where it applies
This problem showcases fundamental tree traversal algorithms.

**Data Structures & Patterns:**
*   **Binary Trees**: Hierarchical data structure.
*   **Queues**: First-In, First-Out (FIFO) collection. Essential for BFS.
*   **Lists/Arrays**: Dynamic collections for storing results.
*   **Breadth-First Search (BFS)**: Explores level by level. Good for shortest paths in unweighted graphs.
*   **Depth-First Search (DFS)**: Explores branches deeply before backtracking. Useful for pathfinding and cycle detection.

**Similar Well-Known Problems:**
*   Binary Tree Level Order Traversal
*   Binary Tree Left Side View
*   Maximum Depth of Binary Tree
*   Populating Next Right Pointers in Each Node
