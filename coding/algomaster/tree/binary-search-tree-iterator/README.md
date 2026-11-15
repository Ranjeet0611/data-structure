# Binary Search Tree Iterator

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/binary-search-tree-iterator) · **Difficulty:** Medium · **Language:** java

This solution implements an iterator for a Binary Search Tree (BST).

## Problem
The goal is to create an iterator for a BST. It must support `next()` to get the smallest element and `hasNext()` to check if more elements exist. Both operations need to be efficient.

## Approach
The solution uses an iterative in-order traversal. It maintains a stack of `TreeNode`s. The stack always holds the path to the next smallest node.
The constructor pushes the root and all its left children onto the stack.
`next()` pops the top node. If this node has a right child, that child and all its left descendants are pushed onto the stack.
`hasNext()` simply checks if the stack is empty.

## Complexity
**Time:**
*   `constructor`: O(h), where h is the tree height. It pushes the leftmost path.
*   `hasNext`: O(1). A simple stack check.
*   `next`: Amortized O(1). Each node is pushed and popped once across all calls. A single call can be O(h) in the worst case.

**Space:**
*   O(h), where h is the tree height. The stack stores at most h nodes. This is O(log N) for balanced trees, O(N) for skewed trees.

## Review
The solution is correct and effectively implements the BST iterator. It correctly handles all operations.
It uses `java.util.Stack`. `java.util.Deque` (like `ArrayDeque`) is generally preferred for stack operations in modern Java.

## Improvements
The accepted solution is already optimal in terms of algorithmic complexity.
A minor improvement is to use `java.util.Deque` (e.g., `ArrayDeque`) instead of `java.util.Stack`. This offers better performance and follows modern Java practices.
The helper method `inorder` could be renamed to `_pushLeftmostPath` for clarity.

## Takeaways
*   **Iterative In-order Traversal:** Learn to traverse trees iteratively using a stack. This avoids recursion depth issues and is key for iterators.
*   **Amortized O(1) Time:** Understand how operations can be efficient on average, even if some individual calls are slower. Each node is processed once.
*   **O(h) Space:** The stack size is limited by the tree's height, which is optimal for this type of iterator.
*   **Iterator Design:** This shows how to build an iterator for sequential access without exposing internal details.

## Where it applies
This solution uses fundamental data structures and patterns:

**Data Structures and Patterns:**
*   **Stack:** Essential for managing the state of the iterative traversal, storing nodes that need to be visited later.
*   **Binary Search Tree (BST):** The underlying data structure, leveraging its property that elements in the left subtree are smaller and elements in the right subtree are larger.
*   **Iterator Pattern:** Provides a standard way to traverse a collection of elements sequentially without exposing its underlying representation.
*   **Lazy Evaluation:** Elements are prepared and returned only when `next()` is called, rather than pre-computing the entire traversal.

**Similar Well-Known Problems:**
*   **Kth Smallest Element in a BST:** Use the iterator to find the Kth element.
*   **Two Sum IV - Input is a BST:** Use two iterators (forward and backward) to find a pair.
*   **Flatten Binary Tree to Linked List:** Adapt the in-order traversal logic.
*   **Finding Successor/Predecessor in BST:** The iterator inherently helps find these.
