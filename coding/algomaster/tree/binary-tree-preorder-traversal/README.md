# Binary Tree Preorder Traversal

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/binary-tree-preorder-traversal) · **Difficulty:** Easy · **Language:** java

## Problem
This problem asks us to visit every node in a binary tree. We need to collect node values in a specific order: first the current node, then its left child, then its right child.

## Approach
The solution uses a recursive Depth-First Search (DFS).
A helper function processes the tree.
It first adds the current node's value to a list.
Then, it recursively calls itself for the left subtree.
Finally, it recursively calls itself for the right subtree.
The recursion stops when it encounters a null node.

## Complexity
**Time:** O(N). Each node is visited exactly once. N is the number of nodes.
**Space:** O(N). This includes O(N) for the result list. The recursion stack can also use O(N) space in the worst case (a skewed tree).

## Review
The accepted solution is clean, correct, and standard. It correctly implements the preorder traversal algorithm. The code is easy to understand and follows good practices. It is efficient and optimal for this problem.

## Improvements
The current recursive solution is already optimal. No significant algorithmic improvements are possible. For extremely deep trees, an iterative solution using an explicit stack could prevent potential stack overflow, but this is not typically needed for common constraints.

## Takeaways
*   **Recursive DFS:** Recursion is a natural fit for tree traversals.
*   **Preorder Order:** Remember the "Node -> Left -> Right" sequence.
*   **Base Case:** A `null` node is crucial for stopping recursion.
*   **Complexity Analysis:** Understand how to analyze time (node visits) and space (recursion stack, output list) for tree algorithms.
*   **Helper Methods:** Using a private helper method is good practice for managing recursive state.

## Where it applies
This problem teaches fundamental tree traversal concepts.

**Data Structures/Patterns:**
*   **Binary Trees:** The core data structure.
*   **Recursion:** The primary pattern for navigating trees.
*   **Depth-First Search (DFS):** Preorder traversal is a type of DFS.

**When to reach for them:**
Use these when you need to process every node in a tree. Preorder traversal is useful when you need to process a parent node before its children. This applies to tasks like copying a tree, evaluating expressions, or serializing a tree structure.

**Similar Problems:**
*   Inorder Traversal
*   Postorder Traversal
*   Maximum Depth of Binary Tree
*   Same Tree
*   Invert Binary Tree
