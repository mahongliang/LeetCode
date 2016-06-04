

//超时
public class PalindromeLinkedList {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	
	 public boolean isPalindrome(ListNode head) {
		 ListNode head1 = head;
		 ListNode head2 = reverseLikedNode(head1);
		 while (head1 != null && head2 != null) {
			if (head1.val != head2.val) {
				return false;
			}
		}
		 if (head1 != null || head2 != null) {
			return false;
		}
		 
		 return true;
	 }
	 
	 public ListNode reverseLikedNode(ListNode head){
		 ListNode pre = null;
		 while(head != null){
			 ListNode temp = head.next;
			 head.next = pre;
			 pre = head;
			 head = temp;
		 }
		 
		 return pre;
	 }
}
