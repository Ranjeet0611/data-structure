import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Traverse to the leftmost node, pushing all ancestors onto the stack
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // current is null, meaning we've reached the leftmost child (or null)
            // Pop the top element, which is the current "root" in inorder
            current = stack.pop();
            result.add(current.val);

            // Now, move to the right child of the popped node
            current = current.right;
        }
        return result;
    }
}