import java.util.HashSet;
import java.util.Set;




public class LinkedListCycle {

	 class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
	}
	 
	 //OT O(n)
	 //OC O(n)
	public boolean hasCycle(ListNode head){
		Set<ListNode> nodes = new HashSet<ListNode>();
		while (head != null) {
			if (nodes.contains(head)) {
				return true;
			}else {
				nodes.add(head);
			}
			head = head.next;			
		}
		return false;
	}
	 
//	 public boolean hasCycle(ListNode head){
//		 if (head == null || head.next == null) {
//			return false;
//		}
//		 
//		ListNode slow = head;
//		ListNode fast = head.next;
//		while(fast != slow){
//			if (fast == null || fast.next == null) {
//				return false;
//			}
//			fast = fast.next.next;
//			slow = slow.next;
//		}
//		return true;
//	 }
	
	
}
