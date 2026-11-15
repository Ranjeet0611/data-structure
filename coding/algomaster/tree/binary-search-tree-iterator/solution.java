class BSTIterator {
    Stack<TreeNode> st = new Stack<>();
    void inorder(TreeNode root){
        if(root==null){
            return;
        }
        st.push(root);
        inorder(root.left);
    }
    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    
    public int next() {
        TreeNode node = st.pop();
        inorder(node.right);
        return node.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
}