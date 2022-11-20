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
    public int getSize(ListNode head){
        int length=0;
        ListNode curr = head;
        while(curr!=null){
            curr=curr.next;
            length++;
        }
        return length;
    }
    public ListNode getAt(ListNode head, int ind){
        ListNode curr= head;
        for(int i=0; i<ind; i++){
            curr=curr.next;
        }
        return curr;
    }
    public ListNode middleNode(ListNode head) {
        int size = getSize(head);
        ListNode ans = getAt(head,size/2);
        return ans;
    }
}