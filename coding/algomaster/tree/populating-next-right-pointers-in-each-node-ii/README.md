# Populating Next Right Pointers in Each Node II

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/populating-next-right-pointers-in-each-node-ii) · **Difficulty:** Medium · **Language:** java

## Problem
Connect each node to its right sibling at the same level. If no right sibling exists, set its `next` pointer to `null`. This applies to a general binary tree, not just a perfect one.

## Approach
The initial solution uses Breadth-First Search (BFS). It processes the tree level by level. A queue stores nodes to visit. For each level, nodes are dequeued, their `next` pointers are set to the subsequent node in the queue, and their children are enqueued for the next level.

## Complexity
*   **Time:** O(N), where N is the number of nodes. Each node is visited once.
*   **Space:** O(W), where W is the maximum width of the tree. In the worst case (a complete binary tree), this can be O(N). This solution does **not** meet the O(1) extra space constraint.

## Review
The provided Java solution is clear and correct for a standard BFS approach. It handles edge cases like a null root. The logic for connecting nodes and managing levels with `queue.size()` is standard and effective.

## Improvements
The primary improvement is to achieve O(1) extra space. The optimized approach avoids using a queue. It leverages the `next` pointers established in the *current* level to build the `next` pointers for the *next* level. It iterates through the current level using its `next` pointers. For each node, it connects its children to form a linked list for the subsequent level, using `dummyHead` and `tail` pointers.

## Takeaways
*   BFS is excellent for level-order tree traversals, often using a queue.
*   Always consider space complexity constraints. A simple BFS might not be optimal for O(1) space requirements.
*   For O(1) space in tree level problems, try to use existing `next` pointers from the previous level to build the current level's connections.
*   The `dummyHead` pattern is useful when building a new linked list segment, simplifying head management.

## Where it applies
### Data Structures
*   **Binary Trees:** Fundamental for hierarchical data.
*   **Queues:** Essential for BFS and level-order processing.
*   **Linked Lists:** The `next` pointers effectively create linked lists at each level.

### Patterns Used
*   **Level-Order Traversal (BFS):** Visiting nodes level by level. Reach for it when processing nodes at the same depth or finding shortest paths.
*   **Iterative Tree Traversal:** Solving tree problems without recursion. Useful for O(1) space or preventing stack overflow in deep trees.
*   **Two-Pointer Technique:** Using multiple pointers to traverse or build data structures. Useful for constructing linked lists or comparing elements.

### Similar Problems
*   Binary Tree Level Order Traversal
*   Binary Tree Right Side View
*   Find Largest Value in Each Tree Row
*   Serialize and Deserialize Binary Tree
