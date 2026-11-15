# Invert Binary Tree

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/invert-binary-tree) · **Difficulty:** Easy · **Language:** java

## Problem
Given the root of a binary tree, invert the tree. This means swapping the left and right children for every node.

## Approach
The accepted solution uses a recursive Depth-First Search (DFS). It follows a post-order traversal pattern. The helper function first recursively inverts the left subtree. Then, it recursively inverts the right subtree. After both subtrees are inverted, it swaps the left and right children of the current node. The base case is when a node is null, it simply returns.

## Complexity
*   **Time:** O(N), where N is the number of nodes. Each node is visited exactly once.
*   **Space:** O(H), where H is the height of the tree. This is due to the recursion stack. In the worst case (skewed tree), H can be N. In the best case (balanced tree), H is log N.

## Review
The solution is correct and effectively inverts the tree. The recursive helper function provides a clean implementation of DFS. The logic for the base case, recursive calls, and the swap operation is clear. Variable names are descriptive, and the code is concise and easy to understand.

## Improvements
The accepted solution is already highly optimal. No significant algorithmic improvements are necessary. It achieves the best possible time complexity. An iterative solution using a queue (BFS) is an alternative, offering similar O(N) time and space complexity.

## Takeaways
*   **Recursive DFS for Tree Manipulation:** Recursion is powerful for structural tree changes. Post-order traversal is useful when child properties must be processed first.
*   **Base Cases are Crucial:** Always define a clear base case to terminate recursion.
*   **Pointer Swapping:** Use a temporary variable for safe and correct pointer swaps in tree modifications.
*   **Recursion Stack Space:** Be aware that recursive solutions use call stack space, proportional to tree height.

## Where it applies
This problem highlights fundamental binary tree and recursion concepts.

**Data Structures/Patterns:**
*   **Binary Trees:** Hierarchical data structures.
*   **Recursion:** Solving problems by breaking them into smaller, similar subproblems.
*   **Depth-First Search (DFS):** A traversal strategy that explores branches deeply. Post-order traversal (left, right, root) is key here.

**When to reach for them:**
Use these patterns when processing hierarchical data, especially for structural changes or calculations based on children's properties.

**Similar Well-Known Problems:**
*   Maximum Depth of Binary Tree
*   Symmetric Tree
*   Same Tree
*   Merge Two Binary Trees
