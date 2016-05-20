import java.util.Currency;


public class RemoveNthNodeFromEndofList {
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        while(head != null){
        	length++;
        	head = head.next;
        }
        
        int m = length-n+1;
        head = dummy;
        while(m > 1){
        	m--;
        	head = head.next;
        }
        head.next = head.next.next;
        
        return dummy.next;
    }
}
