# Rotate List

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/rotate-list) · **Difficulty:** Medium · **Language:** java

## Problem
Rotate a singly linked list to the right by `k` positions.

## Approach
First, calculate the total length of the linked list. Normalize `k` by taking its modulo with the list's length. If the normalized `k` is zero, return the original list. Otherwise, temporarily connect the last node to the original head, forming a circular list. Find the new tail by traversing `length - k` steps from the original head. The node after this new tail becomes the new head. Finally, break the circular link by setting the new tail's `next` pointer to `null`.

## Complexity
Time: O(N), where N is the number of nodes. We traverse the list a few times.
Space: O(1). We use a constant amount of extra space for pointers.

## Review
The accepted solution correctly handles linked list rotation. It manages edge cases like empty lists or `k` being a multiple of the length. Pointer manipulation is sound, and variable names are clear. A helper method is used, which is functional.

## Improvements
The accepted solution is already optimal in terms of time and space complexity. A minor structural improvement could be to inline the logic of the helper method directly into the main function for slightly more concise code, without changing the algorithm's efficiency.

## Takeaways
*   Efficiently traverse linked lists to find length and specific nodes.
*   Use the modulo operator (`%`) to normalize rotation counts for cyclic operations.
*   The "make it circular, then break it" pattern is effective for linked list rotations.
*   Careful pointer manipulation is crucial to correctly re-link nodes.
*   Consolidate edge case checks early for better readability.

## Where it applies
This problem demonstrates fundamental singly linked list manipulation. The core patterns involve careful pointer manipulation and temporary circularization.

Reach for these techniques when:
*   You need flexible data structures for dynamic data.
*   Efficient insertions or deletions at arbitrary positions are required.
*   You are working with cyclic data structures or operations.

Similar well-known problems:
*   Finding the Nth node from the end of a linked list
*   Reversing a linked list
*   Detecting a cycle in a linked list
*   Merging two sorted linked lists
