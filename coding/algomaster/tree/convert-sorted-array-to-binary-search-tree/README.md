# Convert Sorted Array to Binary Search Tree

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/convert-sorted-array-to-binary-search-tree) · **Difficulty:** Easy · **Language:** java

## Problem
The task is to convert a sorted array into a height-balanced Binary Search Tree (BST). A height-balanced tree means the depth of any two subtrees of a node differs by at most one.

## Approach
The solution uses a recursive divide-and-conquer strategy.
It always picks the middle element of the current array segment as the root of the current subtree.
The left half of the array forms the left subtree. The right half forms the right subtree.
This ensures the BST property (left < root < right) and minimizes the tree's height.
Recursion stops when the array segment is empty, returning `null`.

## Complexity
**Time:** O(N), where N is the number of elements. Each element is visited once to create a tree node.
**Space:** O(N). This includes O(N) for the N tree nodes. The recursion stack depth is O(log N), which is dominated by the tree node storage.

## Review
The provided solution is clean, concise, and correct.
It correctly implements the recursive approach to build a height-balanced BST.
The base case for empty subarrays is handled properly.
The midpoint calculation is standard and safe.
The code is highly readable and efficient.

## Improvements
The accepted solution is already optimal.
No further algorithmic improvements can reduce the O(N) time or O(N) space complexity.
All N elements must be processed, and N tree nodes must be created.

## Takeaways
*   **Divide and Conquer**: Break down problems into smaller, similar subproblems.
*   **Recursion**: A natural fit for tree construction and manipulation.
*   **Height-Balanced BST Construction**: Always choose the middle element from a sorted array as the root to ensure balance.
*   **Sorted Array Property**: Crucial for efficiently mapping elements to BST properties.
*   **Optimal Complexity**: O(N) time and space are often the best possible when creating N distinct objects.

## Where it applies
This problem demonstrates fundamental concepts in data structures and algorithms.

**Data Structures & Patterns:**
*   **Binary Search Trees (BSTs)**: Stores ordered data, enabling efficient search.
*   **Height-Balanced Trees**: Ensures O(log N) performance for operations like search, insert, and delete.
*   **Recursion**: Solves problems by breaking them into smaller, self-similar parts.
*   **Divide and Conquer**: Splits a problem into independent subproblems.

**When to reach for them:**
*   When you need efficient storage and retrieval of ordered data.
*   To build balanced tree structures from sorted inputs.
*   For problems that naturally break down into smaller, identical subproblems.

**Similar Problems:**
*   Validating a BST
*   Lowest Common Ancestor (LCA) in a BST
*   Kth Smallest/Largest Element in a BST
*   Tree Traversals (e.g., In-order traversal to get a sorted list)
