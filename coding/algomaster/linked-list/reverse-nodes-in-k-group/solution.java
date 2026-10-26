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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode next = head;
        ListNode current = head;
        ListNode prev = null;
        int count = 0;
        ListNode cursor = head;
        for(int i=0;i<k;i++){
            if(cursor==null){
                return head;
            }
            cursor = cursor.next;
        }
        while(current!=null && count<k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next!=null){
            head.next = reverseKGroup(next,k);
        }
        return prev;
    }
}