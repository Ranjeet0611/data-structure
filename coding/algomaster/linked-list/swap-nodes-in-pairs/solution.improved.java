/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node to simplify operations, especially when the head changes.
        // The dummy node's next will eventually be the new head of the list.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // 'prev' pointer always points to the node *before* the current pair to be swapped.
        ListNode prev = dummy;

        // Iterate while there are at least two nodes remaining to form a pair.
        // prev.next is the first node of the potential pair.
        // prev.next.next is the second node of the potential pair.
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;         // The first node of the current pair
            ListNode second = prev.next.next;   // The second node of the current pair

            // Perform the re-linking to swap 'first' and 'second':
            // 1. The first node (e.g., '1') should now point to the node after the second node (e.g., '3').
            first.next = second.next;
            // 2. The second node (e.g., '2') should now point to the first node (e.g., '1').
            second.next = first;
            // 3. The previous node (e.g., 'dummy') should now point to the second node (e.g., '2'),
            //    making it the new head of this swapped pair.
            prev.next = second;

            // Move 'prev' pointer two steps forward to the new first node (which was the original 'first').
            // This positions 'prev' correctly to be before the *next* pair for the next iteration.
            prev = first;
        }

        // The new head of the list is dummy.next.
        return dummy.next;
    }
}