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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
			return head;
		}
		ListNode dummy1 = new ListNode(-1);
		ListNode dummy2 = new ListNode(-2);

		ListNode odd = dummy1;
		ListNode even = dummy2;
		ListNode curr = head;
		int count = 1;

		while(curr!=null){
			ListNode nextOfcurr = curr.next;
			curr.next = null;
			if(count%2==1){
				odd.next = curr;
				curr = nextOfcurr;
				odd = odd.next;
			}
			else{
				even.next = curr;
				curr = nextOfcurr;
				even = even.next;
			}
			count++;
		}
		ListNode oddHead = dummy1.next;
		ListNode evenHead = dummy2.next;
		odd.next = evenHead;
		return oddHead;
    }
}