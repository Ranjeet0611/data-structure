# Binary Tree Postorder Traversal

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/binary-tree-postorder-traversal) · **Difficulty:** Easy · **Language:** java

*Difficulty: Easy*
*Language: Java*

## Problem
Traverse a binary tree and return its node values in postorder. Postorder means visiting the left child, then the right child, then the current node.

## Approach
The solution uses a recursive Depth-First Search (DFS). A helper function `solve` is called. It first visits the left subtree, then the right subtree. Finally, it adds the current node's value to the result list. The recursion stops when a null node is encountered.

## Complexity
*   **Time:** O(N), where N is the number of nodes. Each node is visited exactly once.
*   **Space:** O(H), where H is the height of the tree. This is for the recursion stack. In the worst case (skewed tree), H can be N. In the best case (balanced tree), H is log N.

## Review
This solution is correct, concise, and easy to read. It accurately implements postorder traversal. The helper method keeps the main function clean. Edge cases like an empty tree are handled well. Variable names are clear.

## Improvements
The current recursive solution is already optimal. It achieves the best possible time and space complexity for this problem. An iterative solution is possible but often more complex without better asymptotic performance. A minor stylistic improvement is making the helper method `private`.

## Takeaways
*   **Recursive Tree Traversal:** Postorder processes child nodes before the parent. This is fundamental for tree manipulation.
*   **Base Cases:** Correctly identifying the `root == null` base case is vital for recursion.
*   **Implicit Stack:** Recursion uses the call stack to manage traversal state, often simplifying code.
*   **DFS Complexity:** Recursive DFS is typically O(N) time and O(H) space.

## Where it applies
This problem highlights **Binary Trees**, **Depth-First Search (DFS)**, and **Recursion**.
Reach for these patterns when:
*   You need to process child nodes before their parent.
*   Evaluating expressions or parsing hierarchical structures.
*   Performing operations that require visiting every node in a tree-like structure.

Similar well-known problems:
*   Deleting a Binary Tree (freeing memory).
*   Calculating Tree Height or Depth.
*   Constructing a Tree from Inorder and Postorder Traversals.
*   Evaluating Postfix Expressions (when represented as a tree).
