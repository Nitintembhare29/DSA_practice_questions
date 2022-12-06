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
    public ListNode middle(ListNode head1){
        ListNode slow = head1;
        ListNode fast = head1;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode mid){
        ListNode prev = null;
        ListNode curr = mid;
        while(curr!=null){
            ListNode nextOfCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextOfCurr;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        // find mid 
        ListNode mid = middle(head);
        // reverse from mid
        ListNode head2 = reverse(mid);
        // find max 
        int ans = 0;
        while(head2!=null){
            int sum = head.val + head2.val;
            ans = Math.max(sum, ans);
            head = head.next;
            head2 = head2.next;
        }
        return ans;
    }
}