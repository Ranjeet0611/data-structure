# Linked List Cycle II

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/linked-list-cycle-ii) · **Difficulty:** Medium · **Language:** java

## Problem
Find the starting node of a cycle in a linked list.
Return `null` if no cycle exists.

## Approach
This solution uses Floyd's Cycle-Finding Algorithm, also known as the Tortoise and Hare algorithm. It involves two pointers: `slow` and `fast`.

**Phase 1: Detect Cycle**
- Both `slow` and `fast` pointers start at the list's `head`.
- `slow` moves one step at a time.
- `fast` moves two steps at a time.
- If `fast` reaches the end of the list (`null`), there is no cycle.
- If `slow` and `fast` meet, a cycle exists.

**Phase 2: Find Cycle Start**
- Once `slow` and `fast` meet, reset `slow` back to the `head`.
- Now, both `slow` and `fast` move one step at a time.
- The point where they meet again is the beginning of the cycle.

## Complexity
**Time Complexity:** O(N)
- N is the number of nodes in the linked list.
- Both pointers traverse the list at most a constant number of times.

**Space Complexity:** O(1)
- The algorithm uses only a few constant extra variables (pointers).
- This meets the requirement for constant memory usage.

## Review
The provided solution is correct, efficient, and well-structured. It accurately implements Floyd's Cycle-Finding Algorithm. It handles edge cases like empty or single-node lists correctly. Variable names are clear, and the logic is robust against `NullPointerExceptions`.

## Improvements
The accepted solution is already optimal. It achieves O(N) time complexity and O(1) space complexity. No significant algorithmic or structural improvements are necessary or possible for this problem under the given constraints.

## Takeaways
1.  **Floyd's Cycle-Finding Algorithm (Tortoise and Hare):** This is the standard algorithm for detecting cycles in linked lists. It is highly efficient, offering O(N) time and O(1) space.
2.  **Two-Phase Approach:** The algorithm works in two distinct phases: first, detecting the cycle; second, finding the cycle's starting node.
3.  **Mathematical Proof:** The logic for finding the cycle start is backed by mathematical properties of distances within the list and cycle.

## Where it applies
The concepts and data structures used here are fundamental in computer science.

**Data Structures and Patterns:**
*   **Linked Lists:** A basic dynamic data structure for sequential data. Efficient for insertions and deletions.
*   **Two-Pointer Technique:** A core pattern where two pointers traverse a data structure, often at different speeds or from different starting points, to solve a problem.

**When to reach for them:**
*   Use **Linked Lists** when you need flexible data storage where elements are often added or removed, and direct index access is not critical.
*   Use the **Two-Pointer Technique** for problems involving comparing elements, finding specific positions (like the middle or K-th from end), or detecting patterns (like cycles or intersections) in sequences.

**Similar Well-Known Problems:**
*   Finding the Middle of a Linked List
*   Finding the K-th Node from the End of a Linked List
*   Detecting Intersection of Two Linked Lists
*   Happy Number Problem
