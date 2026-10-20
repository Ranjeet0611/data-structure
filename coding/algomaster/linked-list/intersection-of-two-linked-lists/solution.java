/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while(nodeA!=nodeB){
            nodeA = nodeA.next;
            nodeB = nodeB.next;
            if(nodeA==nodeB){
                return nodeA;
            }
            if(nodeA==null){
                nodeA = headB;
            }
            if(nodeB==null){
                nodeB = headA;
            }
        }
        return nodeA;
    }
}