public class RemoveDuplicatesfromSortedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

	
	//myslover
//	public ListNode deleteDuplicates(ListNode head) {
//			ListNode dummyHead = new ListNode(0);
//			ListNode curr = dummyHead;
//	        ListNode temp = head;
//	        while (temp != null) {
//				
//				if (temp.next == null || temp.val != temp.next.val) {
//					curr.next = temp;
//					curr = curr.next;
//				}
//				temp = temp.next;
//			}
//	        return dummyHead.next;
//	}
	
	
	//office solver
	public ListNode deleteDuplicates(ListNode head){
		ListNode current = head;
		while (current != null && current.next !=null) {
			if (current.val == current.next.val) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}		
		}
		return head;
	}
}
