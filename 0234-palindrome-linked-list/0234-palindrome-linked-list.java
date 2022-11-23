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
          
   public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextOfCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextOfCurr;
        }
        head = prev;
        return head;
    }
    
   
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        // find mid node
         
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverseList(slow); // reverse list from mid 3,2,1,1,2,3 then 3,2,1,3,2,1
        fast = head;              // keep fast at head and as slow at mid then compare
        
        while(slow!=null){ // last node of reverse linkedList points null so used slow!=null 
            if(slow.val!=fast.val){ 
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
          
    }
}