# Container With Most Water

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/container-with-most-water) · **Difficulty:** Medium · **Language:** java

## Problem
Find the maximum amount of water a container can hold. The container is formed by two vertical lines and the x-axis. Line heights are given in an array.

## Approach
This solution uses a two-pointer technique.
A `start` pointer is at the beginning of the array. An `end` pointer is at the end.
The current area is calculated as `width * height`.
Width is the distance between pointers (`end - start`).
Height is limited by the shorter of the two lines (`min(height[start], height[end])`).
The maximum area found so far is updated.
Crucially, the pointer pointing to the shorter line is moved inwards.
Moving the shorter line offers a chance to find a taller line. This might increase the container's height.
Moving the taller line would only decrease width, with no potential height gain.

## Complexity
**Time:** O(n). The two pointers traverse the array in a single pass. Each step moves one pointer.
**Space:** O(1). Only a constant amount of extra space is used for variables.

## Review
The code is well-structured and easy to read. Variable names are descriptive. The logic for calculating area and moving pointers is correct. Initializing `ans` to `0` is appropriate as area cannot be negative.

## Improvements
The accepted solution is already optimal. It achieves the best possible time and space complexity. No further performance improvements are possible.

## Takeaways
1.  **Two-Pointer Technique:** This problem is a classic example. It optimizes solutions from O(n^2) to O(n). It's great for array problems involving pairs or ranges.
2.  **Greedy Strategy:** Moving the shorter pointer is a greedy choice. It maximizes the potential for increasing container height in the next step.
3.  **Understanding Constraints:** The problem size (N up to 10^5) suggests an O(N) or O(N log N) solution. An O(N^2) approach would be too slow.

## Where it applies
The two-pointer technique is a fundamental pattern. It's useful for array-based problems.
Reach for it when you need to find pairs, ranges, or sub-arrays. It works well on sorted or partially ordered data.

**Similar Well-Known Problems:**
*   Two Sum (for sorted arrays)
*   Valid Palindrome
*   Merge Sorted Array
*   Remove Duplicates from Sorted Array
*   3Sum / 4Sum (often use two pointers after an initial sort)
