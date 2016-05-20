import java.util.ArrayList;

public class ReverseLinkedList {

	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//mysolver TC O(n) SC O(n)
//	public ListNode reverseList(ListNode head) {
//		ListNode dummyHead = new ListNode(0);
//		ListNode temp = head;
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		while(temp != null){
//			list.add(temp.val);
//			temp = temp.next;	
//		}
//		
//		temp = dummyHead;
//		for (int i = list.size()-1; i >= 0 ; i--) {
//			int val = list.get(i);
//			ListNode node = new ListNode(val);
//			temp.next = node;
//			temp = temp.next;
//		}
//		return dummyHead.next;
//	}
	
	//TC O(n) SC O(1)
	public ListNode reverseList(ListNode head){
		ListNode prev = null;
		ListNode curr = head;
		while(curr != null){
			//change current node's next point to previous point
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	
	
	
}
