# Symmetric Tree

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/symmetric-tree) · **Difficulty:** Easy · **Language:** java

## Problem
Determine if a given binary tree is symmetric around its center. This means the left and right subtrees must be mirror images of each other.

## Approach
The solution uses a recursive Depth-First Search (DFS). A helper function `solve(TreeNode left, TreeNode right)` compares two nodes.
It checks if both nodes are null (symmetric) or if only one is null (asymmetric).
If both are non-null, it compares their values. If values match, it recursively checks two pairs:
1. The `left` node's left child with the `right` node's right child.
2. The `left` node's right child with the `right` node's left child.
Both recursive calls must return true for symmetry.

## Complexity
*   **Time:** O(N), where N is the number of nodes. Each node is visited once.
*   **Space:** O(H), where H is the height of the tree. This is for the recursion stack. In the worst case (skewed tree), H can be N. In the best case (balanced tree), H is log N.

## Review
The solution is clear and correctly implements the recursive logic. Base cases for null nodes are handled well. The mirror comparison logic (`left.left` with `right.right`, `left.right` with `right.left`) is correctly applied. It also handles the empty tree case.

## Improvements
The current recursive solution is already optimal in terms of time and space complexity. An alternative optimal approach would be an iterative solution using a queue (Breadth-First Search). This would also achieve O(N) time.

## Takeaways
*   **Recursive Tree Traversal:** Recursion is powerful for breaking down tree problems.
*   **Base Cases:** Correctly define base cases for null nodes to handle edge conditions.
*   **Mirror Comparison:** For symmetry, compare outer children and inner children across the mirror axis.
*   **Null Handling:** Careful checks for null nodes prevent errors and ensure correct logic.

## Where it applies
This problem uses fundamental concepts like binary trees, recursion, and depth-first traversal.
*   **Data Structures:** Binary trees are used in databases, file systems, and compilers.
*   **Structural Validation:** Checking for symmetry is useful in data validation for hierarchical structures.
*   **UI/UX Design:** Mirroring layouts for different languages or interfaces.
*   **Similar Problems:** This pattern helps solve "Same Tree", "Invert Binary Tree", "Maximum Depth of Binary Tree", and "Path Sum".
