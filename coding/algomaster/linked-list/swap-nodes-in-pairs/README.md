# Swap Nodes in Pairs

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/swap-nodes-in-pairs) · **Difficulty:** Medium · **Language:** java

## Problem
The goal is to swap every two adjacent nodes in a linked list. A key constraint is to modify the existing nodes by re-linking them, not by changing their values or creating new nodes.

## Approach
The accepted solution iterates through the original linked list. It pushes node values onto a stack. When the stack has two or more elements, it pops them. It then creates new `ListNode` objects with these values in reversed order. These new nodes are appended to an entirely new linked list. Finally, the head of this new list is returned.

## Complexity
*   **Time Complexity**: O(N). The solution traverses the list once to push N values onto the stack. It then processes these N values to create N new nodes. Stack operations are O(1).
*   **Space Complexity**: O(N). A stack stores up to N integers. An entirely new linked list with N nodes is constructed. Both contribute O(N) space.

## Review
The accepted solution has critical issues. It violates a fundamental problem constraint by creating *new* `ListNode` objects and copying values. The problem requires re-linking *existing* nodes. This approach is also inefficient. It uses O(N) extra space when an O(1) space solution is possible. The logic for stack processing and new list construction is more complex than necessary for this problem.

## Improvements
The current solution is not optimal and violates a key problem constraint. An optimal solution must modify the `next` pointers of existing nodes directly. This achieves an in-place swap. It significantly reduces space complexity.

The optimal approach uses a **dummy node** to simplify operations. It iteratively re-links pairs of nodes. A `prev` pointer tracks the node before the current pair. It identifies the `first` and `second` nodes of a pair. Then, it carefully adjusts their `next` pointers and the `prev.next` pointer to swap them. The `prev` pointer then advances to prepare for the next pair.

## Takeaways
*   **Read Problem Constraints Carefully**: Always understand explicit requirements, like "in-place" or "without modifying values." Violating these makes a solution invalid.
*   **Linked List Pointer Manipulation**: Mastering how to adjust `next` pointers is crucial for linked list problems. Avoid creating new nodes unless explicitly allowed.
*   **Dummy/Sentinel Nodes**: Use a dummy node to simplify linked list operations. It handles edge cases, especially when the list head might change.
*   **Iterative vs. Recursive Solutions**: Iterative solutions for linked lists often use O(1) extra space. Recursive solutions use O(N) space for the call stack.

## Where it applies
This problem uses **Singly Linked Lists**. The optimal solution demonstrates key patterns:
*   **Pointer Manipulation**: Adjusting `next` pointers to re-arrange nodes. This is fundamental for linked list algorithms.
*   **Dummy/Sentinel Node**: Simplifies handling the list's head and provides a consistent `prev` reference.
*   **Iterative Traversal**: Processing the list step-by-step, often for O(1) extra space.

Reach for these patterns when:
*   You need to modify the structure of a linked list in-place.
*   You need to handle edge cases at the beginning of a list without special `if (head == null)` checks.
*   You want to process a list with minimal auxiliary space.

Similar well-known problems these patterns help solve:
*   Reversing a Linked List
*   Merging Two Sorted Linked Lists
*   Removing Nth Node From End of List
*   Partition List
