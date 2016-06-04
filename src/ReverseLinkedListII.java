
public class ReverseLinkedListII {
	class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {
			// TODO Auto-generated constructor stub
			val = x;
		}
	}
	
	public ListNode reverseBetween(ListNode head, int m, int n){
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		head = dummy;
		for (int i = 1; i < m; i++) {
			head = head.next;
		}
		
		ListNode father = head;
		ListNode mNode = head.next;
		ListNode nNode = mNode, postNode = nNode.next;
		for (int i = m; i < n; i++) {
			ListNode temp = postNode.next;
			postNode.next = nNode;
			nNode = postNode;
			postNode = temp;
		}
		mNode.next = postNode;
		father.next = nNode;
		return dummy.next;
	}
}
