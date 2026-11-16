class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node currentLevelHead = root;

        while (currentLevelHead != null) {
            // dummyHead is used to build the linked list for the next level.
            // tail points to the last node added to the next level's list.
            Node dummyHead = new Node(0);
            Node tail = dummyHead;

            // Iterate through the nodes of the current level using their 'next' pointers.
            Node levelNode = currentLevelHead;
            while (levelNode != null) {
                if (levelNode.left != null) {
                    tail.next = levelNode.left;
                    tail = tail.next;
                }
                if (levelNode.right != null) {
                    tail.next = levelNode.right;
                    tail = tail.next;
                }
                levelNode = levelNode.next;
            }

            // Move to the next level. The head of the next level is dummyHead.next.
            currentLevelHead = dummyHead.next;
        }

        return root;
    }
}