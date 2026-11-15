class Solution {
    void solve(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        solve(root.left,result);
        result.add(root.val);
        solve(root.right,result);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        solve(root,result);
        return result;
    }
}