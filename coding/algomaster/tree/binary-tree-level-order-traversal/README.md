# Binary Tree Level Order Traversal

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/binary-tree-level-order-traversal) · **Difficulty:** Medium · **Language:** java

## Problem
Traverse a binary tree. Collect node values level by level. Return a list of lists. Each inner list contains values for one level.

## Approach
This solution uses Breadth-First Search (BFS). It processes the tree level by level.
A queue stores nodes to visit.
Start by adding the root to the queue.
In each step, count nodes in the queue. This is the current level's size.
Dequeue these nodes. Add their values to a temporary list.
Enqueue their non-null children.
Add the temporary list to the final result.
Repeat until the queue is empty.

## Complexity
*   **Time**: O(N). N is the number of nodes. Each node is visited once.
*   **Space**: O(N). The queue can hold up to N/2 nodes (widest level). The result list stores all N node values.

## Review
The solution is clear and correct. It uses standard BFS with a queue.
It handles an empty tree correctly.
Nodes are grouped by level using `queue.size()` at each iteration.
Variable names are descriptive.
A minor stylistic point: `while(!queue.isEmpty())` is more concise than `while(queue.isEmpty()==false)`. This does not affect performance.

## Improvements
The accepted solution is already optimal. No significant algorithmic improvements are possible.
It uses the best possible time and space complexity for this problem.
Minor stylistic changes, like `!queue.isEmpty()`, can improve conciseness.

## Takeaways
*   **BFS for Level Order**: BFS is ideal for level-by-level tree traversal.
*   **Queue Usage**: A queue is fundamental for BFS. It ensures FIFO processing.
*   **Level Delimitation**: Use `queue.size()` at the start of each loop. This groups nodes by level.
*   **Edge Case**: Always handle a `null` root for tree problems.

## Where it applies
This problem uses the Breadth-First Search (BFS) algorithm. It relies on a `Queue` data structure.

**Data Structures and Patterns:**
*   **Queue**: Essential for BFS. Processes nodes in FIFO order. `LinkedList` implements `Queue` in Java.
*   **List (ArrayList)**: Stores results, grouping node values by level.
*   **Breadth-First Search (BFS)**: Explores all neighbors at the current depth before moving deeper.

**When to use them:**
Reach for BFS when you need to:
*   Find the shortest path in an unweighted graph.
*   Process elements level by level in a tree or graph.
*   Explore all reachable nodes from a starting point.

**Similar Problems:**
*   Binary Tree Zigzag Level Order Traversal
*   Binary Tree Right Side View
*   Minimum Depth of Binary Tree
*   Number of Islands
