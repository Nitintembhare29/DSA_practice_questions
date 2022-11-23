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
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
       	ListNode slow = head;
	    ListNode fast = head;
        
	while(fast.next!=null && fast.next.next!=null){
	    slow=slow.next;  // time comlexity O(n)
	    fast=fast.next.next;
	}
	return slow;
    }
    
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null){
            ListNode nextOfCurr = curr.next;
            curr.next=prev;
            
            prev = curr;
            curr = nextOfCurr;
            
        }
        head = prev;
        return head;
    }
    
    public ListNode merge(ListNode head1, ListNode head2){
      ListNode dummy = new ListNode(-1);
        ListNode p1 = head1;
        ListNode p2 = head2;
        ListNode curr = dummy;
        
        while(p1!=null && p2!=null){
        // storing next values and break connection with next node
        ListNode nextOfp1 = p1.next;
        p1.next=null;
        
        ListNode nextOfp2 = p2.next;
        p2.next=null;
        
        // first add p1
        curr.next=p1;
        p1 = nextOfp1;
        curr=curr.next;
        
        // then add p2
        curr.next=p2;
        p2 = nextOfp2;
        curr=curr.next;
        } 
        curr.next=p1;
        return dummy.next;
    }
    
    public void reorderList(ListNode head) {
        // find mid node
        ListNode mid = middleNode(head);
        
        // break into two parts
        ListNode head2= mid.next;
        mid.next=null;
        
        // reverse second list
        head2 = reverseList(head2);
        
        // merge two lists
        head = merge(head,head2);
    }
}