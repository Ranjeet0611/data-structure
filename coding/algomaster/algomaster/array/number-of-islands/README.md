# Number of Islands

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/number-of-islands) · **Difficulty:** Medium · **Language:** java

## Problem
Count the number of connected components of land ('1') in a 2D grid, where land connects horizontally or vertically.

## Approach
Use Depth-First Search (DFS) to traverse the grid. When a land cell is found, increment the island count and recursively sink all connected land cells by mutating them to '0'.

## Complexity
Time Complexity: $O(M \times N)$ where $M$ is rows and $N$ is columns, as every cell is visited a constant number of times. 
Space Complexity: $O(\min(M, N))$ in the worst case for the DFS recursion stack when mutating the grid in place.

## Review
The core DFS logic is correct. The standard approach using an extra visited matrix costs unnecessary memory. The optimized solution removes the visited matrix and mutates the grid directly to save space.

## Improvements
Mutate the input grid cells in place from '1' to '0' during traversal. This eliminates the extra boolean matrix and reduces auxiliary space to the size of the recursion stack.

## Takeaways
1. Treat 2D matrices as graphs where cells are nodes and orthogonal neighbors are edges.
2. Mutating the input grid safely reduces auxiliary space overhead from $O(M \times N)$ to recursion stack limits.

## Where it applies
Data Structures: 2D Arrays, Graphs, DFS, BFS, Disjoint Set Union.
When to reach for it: Use this pattern for connected-component labeling, spatial clustering, and flood fill operations.
Similar problems: 'Max Area of Island', 'Surrounded Regions', 'Pacific Atlantic Water Flow', 'Word Search'.
