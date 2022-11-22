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
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
        while(curr!=null){
            // save next pointer
            ListNode nextOfCurr = curr.next;
            // reverse pinter
            curr.next = prev;
            // move pointer
            prev = curr;
            curr = nextOfCurr;
        }
        head = prev;
        return head;

    }
}