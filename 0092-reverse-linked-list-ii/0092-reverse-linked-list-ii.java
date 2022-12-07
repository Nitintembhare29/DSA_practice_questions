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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode gpart = dummy;
        for(int i=0; i<left-1; i++){
            gpart = gpart.next;
        }
                // reverse 1

        ListNode prev = null;
        ListNode curr = gpart.next;
        for(int i=1; i<=right-left+1; i++){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        gpart.next.next = curr;
        gpart.next = prev;
        return dummy.next;
    }
}