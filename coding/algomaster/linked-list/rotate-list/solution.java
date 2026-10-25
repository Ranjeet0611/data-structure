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
    public ListNode findNNode(ListNode head,int k){
        ListNode current = head;
        int count = 1;
        while(current!=null){
            if(count==k){
                return current;
            }
            current = current.next;
            count++;
        }
        return current;
    }
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null){
         return null;
       }
       ListNode current = head;
       int length = 1;
       while(current.next!=null){
        current = current.next;
        length++;
       }
       k = k%length;
       if(k==0){
        return head;
       }
       current.next = head;
       ListNode lastNode = findNNode(head,length-k);
       head = lastNode.next;
       lastNode.next = null;
       return head;
    }
}