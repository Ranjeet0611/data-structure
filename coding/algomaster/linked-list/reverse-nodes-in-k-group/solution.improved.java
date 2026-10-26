class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupTail = dummy; // Points to the node *before* the current k-group

        while (true) {
            // 1. Check if there are k nodes remaining
            ListNode groupHead = prevGroupTail.next;
            ListNode groupEnd = groupHead;
            for (int i = 0; i < k - 1; i++) {
                if (groupEnd == null) { // Not enough nodes
                    break;
                }
                groupEnd = groupEnd.next;
            }

            if (groupEnd == null) { // Not enough nodes, break the loop. The remaining part is untouched.
                break;
            }

            // 2. Store the next group's head
            ListNode nextGroupHead = groupEnd.next;

            // 3. Reverse the current k-group (from groupHead to groupEnd)
            //    'prev' will become the new head of the reversed group (original groupEnd)
            //    'current' will iterate from groupHead to nextGroupHead (exclusive)
            ListNode current = groupHead;
            ListNode prev = nextGroupHead; // The 'next' for the first node in the k-group (which becomes the tail)
            ListNode tempNext;

            while (current != nextGroupHead) {
                tempNext = current.next;
                current.next = prev;
                prev = current;
                current = tempNext;
            }
            // After this loop:
            // 'prev' is the new head of the reversed k-group (it's the original groupEnd)
            // 'current' is nextGroupHead
            // 'groupHead' is the original groupHead, now the tail of the reversed k-group

            // 4. Connect the reversed group to the main list
            prevGroupTail.next = prev; // Connect the previous group's tail to the new head of the reversed group
            groupHead.next = nextGroupHead; // Connect the new tail of the reversed group to the next group's head

            // 5. Prepare for the next iteration
            prevGroupTail = groupHead; // The original groupHead (now the tail) becomes the prevGroupTail for the next iteration
        }

        return dummy.next;
    }
}