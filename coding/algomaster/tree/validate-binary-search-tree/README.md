# Validate Binary Search Tree

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/validate-binary-search-tree) · **Difficulty:** Medium · **Language:** java

## Problem
Check if a given binary tree is a valid Binary Search Tree (BST). A BST requires all nodes in the left subtree to be strictly less than the parent, and all nodes in the right subtree to be strictly greater than the parent.

## Approach
This solution uses a recursive Depth-First Search (DFS). A helper function `isBST` takes the current node, a `minValue`, and a `maxValue`. These bounds define the valid range for the current node's value.

Initially, for the root, `minValue` is `Long.MIN_VALUE` and `maxValue` is `Long.MAX_VALUE`.
1. If a node is `null`, it's a valid BST.
2. If the node's value is outside `(minValue, maxValue)`, it's invalid.
3. For the left child, the new `maxValue` becomes the current node's value.
4. For the right child, the new `minValue` becomes the current node's value.
5. The tree is valid only if both left and right subtrees are valid BSTs.

## Complexity
- **Time Complexity**: O(N), where N is the number of nodes. Each node is visited once.
- **Space Complexity**: O(H), where H is the height of the tree. This is due to the recursion stack. In the worst case (skewed tree), H can be N, leading to O(N). In the best case (balanced tree), H is log N, leading to O(log N).

## Review
The accepted solution is well-implemented and correct. It effectively uses `long` for `minValue` and `maxValue`. This correctly handles `Integer.MIN_VALUE` and `Integer.MAX_VALUE` without overflow. Strict inequality checks (`root.val <= minValue` or `root.val >= maxValue`) are correctly enforced. The base case for `null` nodes and the recursive propagation of bounds are sound.

## Improvements
The accepted solution is already optimal in terms of time and space complexity. No significant algorithmic improvements are possible. Minor stylistic changes, like removing a redundant `null` check in the main function, would not impact performance or correctness.

## Takeaways
- **Recursive DFS with Bounds**: This is a key pattern for validating tree properties. Passing min/max bounds down the recursion tree provides crucial context.
- **Handling Integer Limits**: Use `long` for boundary checks when dealing with `Integer.MIN_VALUE` and `Integer.MAX_VALUE`. This prevents overflow and ensures correct strict inequality evaluations.
- **Strict BST Definition**: Remember that BSTs require *strictly less than* for left children and *strictly greater than* for right children.

## Where it applies
This solution demonstrates fundamental concepts for tree validation.

**Data Structures and Patterns Used:**
- **Binary Trees**: The core data structure.
- **Binary Search Trees (BSTs)**: The specific ordered tree type.
- **Depth-First Search (DFS)**: The traversal strategy.
- **Recursion**: An elegant way to implement DFS and manage state.
- **Range/Bounds Checking**: A common pattern for validating values within an interval.

**When to reach for these:**
- When you need to validate structural or ordering properties of a tree.
- When traversing a tree and needing to pass contextual information (like valid ranges) to child nodes.

**Similar Well-Known Problems:**
- Search in a BST
- Insert/Delete in a BST
- Kth Smallest Element in a BST
- Lowest Common Ancestor (LCA) in a BST
