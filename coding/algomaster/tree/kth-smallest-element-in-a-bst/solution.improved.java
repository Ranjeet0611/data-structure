class Solution {
    private int count;
    private int result;

    public int kthSmallest(TreeNode root, int k) {
        count = 0;
        result = -1; // Initialize with a value that indicates not found yet
        inorderTraversal(root, k);
        return result;
    }

    private void inorderTraversal(TreeNode node, int k) {
        // If node is null or we've already found the result, stop.
        if (node == null || result != -1) {
            return;
        }

        // Traverse left subtree
        inorderTraversal(node.left, k);

        // If result found in left subtree, propagate stop
        if (result != -1) {
            return;
        }

        // Visit current node
        count++;
        if (count == k) {
            result = node.val;
            return; // Found the kth smallest, stop further traversal
        }

        // Traverse right subtree
        inorderTraversal(node.right, k);
    }
}