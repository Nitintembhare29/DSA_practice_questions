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
    public ListNode detectCycle(ListNode head){
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow = slow.next;
                if(fast==slow){
                    break;
                }
            }
        if(fast!=slow){
            return null;
        }
        slow = head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode curr = headA;
        
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=headA;// making cycle for check from other list and then undo cycle
        
        ListNode ans = detectCycle(headB);
        curr.next=null; // undo curr.next=headA
        return ans;
    }
}