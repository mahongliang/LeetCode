

public class InsertionSortList {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	
	public ListNode insertionSortList(ListNode head) {
		ListNode dummy = new ListNode(-1);
		while(head != null){
			ListNode temp = head.next;
			ListNode node = dummy;
			while(node.next != null && node.next.val < head.val){
				node = node.next;
			}
			
			head.next = node.next;
			node.next = head;
			head = temp;
		}
		
		return dummy.next;
	}
	
}
