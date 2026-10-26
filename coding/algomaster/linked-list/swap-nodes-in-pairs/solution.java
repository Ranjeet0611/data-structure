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
         if(head==null){
            return null;
        }
        Stack<Integer> st = new Stack<>();
        ListNode current = head;
        ListNode newNode = null;
        ListNode prev = newNode;
        while(current!=null){
            if(st.size()>=2){
                while(!st.isEmpty()){
                    if(newNode==null){
                        newNode = new ListNode(st.pop());
                        prev = newNode;
                    }
                    else{
                        ListNode temp = new ListNode(st.pop());
                        prev.next = temp;
                        prev = prev.next;
                    }
                }

            }
            st.push(current.val);
            current = current.next;
        }
        while(!st.isEmpty()){
             if(newNode==null){
                newNode = new ListNode(st.pop());
                prev = newNode;
            }
            else{
                ListNode temp = new ListNode(st.pop());
                prev.next = temp;
                prev = prev.next;
            }
        }
        return newNode;
    }
}