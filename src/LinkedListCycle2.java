import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle2 {

	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	  
	 public ListNode detectCycle(ListNode head) {
	        Set<ListNode> set = new HashSet<ListNode>();
	        while(head != null){
	        	if (set.contains(head)) {
					return head;
				}else {
					set.add(head);
				}
	        	head= head.next;
	        }
	        return null;
	 }

}
