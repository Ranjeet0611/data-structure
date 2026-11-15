# Binary Tree Inorder Traversal

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/binary-tree-inorder-traversal) · **Difficulty:** Easy · **Language:** java

## Problem
Traverse a binary tree. Return node values in inorder sequence.

## Approach
The initial solution uses recursion. It follows the standard inorder pattern:
1.  Visit the left subtree.
2.  Add the current node's value.
3.  Visit the right subtree.
A helper function manages the recursive calls.

## Complexity
*   **Time**: O(N). Each node is visited exactly once. N is the number of nodes.
*   **Space**: O(N) in the worst case. This includes the result list and recursion stack. The stack depth can be N for a skewed tree.

## Review
The recursive code is clear and concise. It directly implements the inorder traversal definition. It's a perfectly acceptable solution for the given constraints (N <= 100).

## Improvements
The problem's follow-up asks for an iterative solution. An iterative approach uses an explicit stack. This avoids potential stack overflow issues for very deep trees. It also offers more control over the traversal process.

## Takeaways
*   **Recursive vs. Iterative**: Both are valid for tree traversals. Recursion is often simpler to write. Iteration with a stack provides more control and avoids deep call stacks.
*   **Inorder Pattern**: The fundamental order is Left -> Root -> Right. This is crucial for tasks like retrieving sorted elements from a Binary Search Tree (BST).
*   **Stack for Iterative DFS**: An explicit stack is key to converting recursive Depth-First Search (DFS) algorithms into iterative ones. It simulates the call stack.
*   **Helper Functions**: Improve code organization and readability for recursive algorithms.

## Where it applies
This problem demonstrates **Binary Trees**, **Depth-First Search (DFS)**, **Recursion**, and **Stacks**.

*   **Binary Trees**: Fundamental for organizing hierarchical data.
*   **DFS**: A core algorithm for exploring all nodes in a 'depth-first' manner.
*   **Recursion**: A powerful technique for solving problems by breaking them into smaller, similar subproblems.
*   **Stacks**: Essential for managing function calls, parsing, and converting recursive algorithms to iterative ones.

**When to reach for them**:
*   When processing hierarchical data structures (trees, file systems, XML/HTML DOM).
*   When exploring all paths or nodes from a starting point (DFS).
*   When a problem naturally has self-similar subproblems (recursion).
*   When needing Last-In, First-Out (LIFO) behavior, such as backtracking or managing execution order (stacks).

**Similar Problems**:
*   Preorder and Postorder Traversal (recursive and iterative).
*   Validate Binary Search Tree.
*   Lowest Common Ancestor of a Binary Tree.
*   Binary Tree Level Order Traversal (uses Breadth-First Search, but related to tree traversal).
