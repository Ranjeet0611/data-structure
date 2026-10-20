# Intersection of Two Linked Lists

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/intersection-of-two-linked-lists) · **Difficulty:** Easy · **Language:** java

## Problem
Find the node where two singly linked lists first intersect. Return `null` if no intersection exists.

## Approach
This solution uses a clever two-pointer technique.
Initialize two pointers, `nodeA` to `headA` and `nodeB` to `headB`.
In a loop, advance both pointers one step at a time.
If `nodeA` reaches the end of `ListA`, it switches to `headB`.
If `nodeB` reaches the end of `ListB`, it switches to `headA`.
This ensures both pointers travel the same total distance (`lengthA + lengthB`).
If the lists intersect, the pointers will meet at the first common node.
If they do not intersect, both pointers will eventually meet at `null`.

## Complexity
*   **Time:** O(m + n), where `m` is the length of `ListA` and `n` is the length of `ListB`. Each pointer traverses at most `m + n` nodes.
*   **Space:** O(1), as only a constant number of pointers are used.

## Review
The accepted solution is highly efficient.
It correctly implements the "A+B=B+A" two-pointer strategy.
It handles all edge cases gracefully, including null lists or immediate intersection.
The code is concise and robust.

## Improvements
The accepted solution is already optimal.
It achieves O(m + n) time and O(1) space complexity.
No significant algorithmic improvements can be made.

## Takeaways
*   **Two-Pointer Technique:** A classic and efficient way to solve linked list problems. It helps resolve relationships between elements.
*   **A+B=B+A Trick:** This specific pattern makes pointers cover equal total distances. It's crucial for finding intersections or relative positions.
*   **O(1) Space:** This technique solves the problem without requiring additional data structures, making it very memory efficient.
*   **Robustness:** The solution gracefully handles various null and edge cases.

## Where it applies
This solution uses **Singly Linked Lists** and the **Two Pointers** pattern.

Reach for these patterns when:
*   You need to compare elements from different parts of a list.
*   You need to find a specific node or relationship without using extra space.
*   You need to traverse lists with potentially different lengths to find a common point.

Similar well-known problems:
*   Detecting Cycles in a Linked List (Floyd's Cycle-Finding Algorithm)
*   Finding the Start of a Cycle in a Linked List
*   Finding the Middle of a Linked List
*   Nth Node From End of Linked List
