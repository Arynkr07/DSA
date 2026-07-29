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
    public ListNode doubleIt(ListNode head) {
        //reverse
        ListNode curr1 = head;
        ListNode prev1 = null;
        while(curr1!=null){
            ListNode t = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = t;
        }
        ListNode p = prev1;

        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(p !=null || carry != 0 ){
            int val =0;
            if(p != null){
                val = p.val;
                p = p.next;
            }
            int mul = (val *2) +carry;
            carry = mul/10;
            int multiplied = mul % 10;
            
            curr.next = new ListNode(multiplied);
            curr = curr.next;
        }
        ListNode currf = dummy.next;
        ListNode prevf = null;
        while( currf != null){
            ListNode tf = currf.next;
            currf.next = prevf;
            prevf  = currf;
            currf = tf;
        }
        return prevf;
    }
}