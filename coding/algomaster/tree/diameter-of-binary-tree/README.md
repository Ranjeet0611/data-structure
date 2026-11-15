# Diameter of Binary Tree

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/diameter-of-binary-tree) · **Difficulty:** Easy · **Language:** java

## Problem
Find the longest path between any two nodes in a binary tree. This path might or might not pass through the root.

## Approach
This solution uses a recursive Depth-First Search (DFS). It's a post-order traversal.
A helper function calculates the height of each subtree.
While calculating height, it also tracks the maximum diameter found so far.
For each node, the diameter passing through it is `left_subtree_height + right_subtree_height`.
The global maximum diameter is updated with this value.
The function returns `1 + max(left_subtree_height, right_subtree_height)` as the current subtree's height.

## Complexity
**Time:** O(N). Each node is visited exactly once. N is the number of nodes.
**Space:** O(H). This is for the recursion stack. H is the height of the tree.
In the worst case (skewed tree), H can be N, leading to O(N) space.
In the best case (balanced tree), H is log N, leading to O(log N) space.

## Review
The solution is correct and effectively solves the problem.
It correctly identifies how to calculate the diameter.
The solution is efficient, visiting each node only once.
The code is readable with clear variable names.
Using a class member variable (`maxDia`) for the global maximum is a common pattern.
A minor point: the helper method `solve` could have a more descriptive name.

## Improvements
The accepted solution is already optimal.
It achieves O(N) time complexity, which is the best possible.
No significant algorithmic improvements are possible.
Renaming the `solve` method for better clarity is a minor stylistic suggestion.

## Takeaways
1.  **Recursive DFS:** Many tree problems use recursion, often with a Depth-First Search (DFS) pattern.
2.  **Post-order Traversal:** Ideal when a parent node needs information from its children first (e.g., height, diameter).
3.  **Dual-Purpose Recursion:** A recursive function can return one value (like height) while updating a global maximum (like diameter) as a side effect.
4.  **Diameter Definition:** The diameter can pass through the current node (`left_height + right_height`) or be entirely within a subtree.

## Where it applies
This problem and its solution demonstrate fundamental tree concepts.

**Data Structures & Patterns:**
*   **Binary Trees:** For hierarchical data.
*   **Recursion:** Powerful for processing tree structures.
*   **Depth-First Search (DFS):** Specifically post-order traversal.
*   **Dynamic Programming on Trees (Implicit):** Height calculations are reused.

**When to reach for them:**
When you need to compute a value for a node based on its children's values, or find a global maximum/minimum value across paths or subtrees.

**Similar Problems:**
*   Maximum Depth of Binary Tree
*   Minimum Depth of Binary Tree
*   Balanced Binary Tree
*   Binary Tree Maximum Path Sum
