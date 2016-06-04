

public class SwapNodesinPairs {

	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }

	public class Solution {
	    public ListNode swapPairs(ListNode head) {
	    	if(head == null || head.next== null) return head;
	        ListNode dummy = new ListNode(-1);
	        dummy.next = head;
	        ListNode current = dummy;

	        while (current.next != null && current.next.next != null) {
	        	ListNode first = current.next, second = current.next.next;
	        	current.next = second;
	        	first.next = second.next;
	        	second.next = first;
     
				current = current.next.next;			
			}
	        
	        return dummy.next;
	    }
	}
}
