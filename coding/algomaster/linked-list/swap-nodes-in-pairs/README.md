# Swap Nodes in Pairs

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/swap-nodes-in-pairs) · **Difficulty:** Medium · **Language:** java

## Problem
The task is to swap every two adjacent nodes in a linked list. For example, a list 1->2->3->4 should become 2->1->4->3.

## Approach
The solution uses an iterative method. It employs three main pointers: `first`, `second`, and `prev`.
`first` points to the current node, and `second` points to the next node. These form the pair to be swapped.
`prev` tracks the node immediately before the current pair.
The algorithm iterates through the list, identifying pairs. For each pair, it re-arranges the pointers.
`second` is made to point to `first`, and `first` points to `second.next`.
The `prev` pointer links the previously processed part of the list to the newly swapped pair's head (`second`).
Special handling updates the overall list `head` if the first pair is swapped.
The process continues until no more pairs can be formed.

## Complexity
*   **Time:** O(N), where N is the number of nodes. The algorithm traverses the list once.
*   **Space:** O(1). It uses a fixed number of auxiliary pointers regardless of list size.

## Review
The solution is correct and handles various edge cases well. This includes empty lists, single-node lists, and lists with an odd or even number of nodes. The pointer manipulation logic is sound. Variable names are clear, aiding in understanding.

## Improvements
The accepted solution is already optimal in terms of asymptotic time and space complexity (O(N) time, O(1) space). No further algorithmic improvements are necessary for better performance.
Minor stylistic improvements could include:
1.  **Dummy Node:** Using a dummy head node can simplify the logic for updating the list's head.
2.  **Recursive Approach:** A recursive solution is an alternative. It can be more concise but uses O(N) stack space.

## Takeaways
*   **Linked List Pointer Manipulation:** This problem is a classic for practicing careful pointer handling (`prev`, `current`, `next`).
*   **Iterative vs. Recursive Solutions:** Many linked list problems can be solved both ways. Iterative often uses O(1) space.
*   **Dummy Head Node Pattern:** This pattern simplifies handling modifications at the beginning of a linked list.
*   **Edge Case Handling:** Always consider empty lists, single-node lists, and lists with odd/even lengths.

## Where it applies
The techniques here are fundamental to linked list manipulation.
*   **Data Structures:** Linked lists are used in queues, stacks, hash map collision resolution, and some OS memory management.
*   **Patterns:** Pointer manipulation is crucial in low-level programming, embedded systems, and kernel development.
*   **Similar Problems:** This problem builds a foundation for:
    *   Reverse Linked List
    *   Merge Two Sorted Lists
    *   Remove Nth Node From End of List
    *   Swap Nodes in K-groups
