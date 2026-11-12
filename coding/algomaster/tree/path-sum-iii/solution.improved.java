/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int count = 0;
    private int target;
    private HashMap<Long, Integer> prefixSumCounts;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        this.target = targetSum;
        this.prefixSumCounts = new HashMap<>();
        // Initialize with 0 sum having one occurrence to handle paths starting from root
        prefixSumCounts.put(0L, 1);

        dfs(root, 0L);

        return count;
    }

    private void dfs(TreeNode node, long currentSum) {
        if (node == null) {
            return;
        }

        // Add current node's value to the sum
        currentSum += node.val;

        // Check if there's a prefix sum that makes the current path sum to target
        // i.e., currentSum - target = prefixSum
        if (prefixSumCounts.containsKey(currentSum - target)) {
            count += prefixSumCounts.get(currentSum - target);
        }

        // Add the current sum to the map
        prefixSumCounts.put(currentSum, prefixSumCounts.getOrDefault(currentSum, 0) + 1);

        // Recurse on children
        dfs(node.left, currentSum);
        dfs(node.right, currentSum);

        // Backtrack: remove the current sum's contribution before returning to parent
        // This is crucial because paths in sibling subtrees should not consider this currentSum
        prefixSumCounts.put(currentSum, prefixSumCounts.get(currentSum) - 1);
        // Optional: if (prefixSumCounts.get(currentSum) == 0) prefixSumCounts.remove(currentSum);
    }
}