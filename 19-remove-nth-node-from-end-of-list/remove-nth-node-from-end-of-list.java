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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length =0;
        while(curr!=null){
            length +=1;
            curr = curr.next;
        }
        if(length == n ) return head.next;
        curr =head;
        int c =0;
        while(curr != null){
            
            c +=1;
            if(c== (length-n)){
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }
        return head;
    }
}