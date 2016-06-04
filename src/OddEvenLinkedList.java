

public class OddEvenLinkedList {
	class ListNode {
		int val;
		ListNode next;
		 ListNode(int x) {
			val = x;
		}
	}
	public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode dummy3 = dummy1;
        ListNode dummy4 = dummy2;
        ListNode cur = head;
        while(cur != null){
        	dummy1.next = cur;
        	dummy1 = dummy1.next;
        	if (cur.next == null) {
				dummy2.next=null;
				break;
			}else {
				dummy2.next = cur.next;
			}	
        	
        	dummy2 = dummy2.next;
        	cur = cur.next.next;   	
        }
        dummy1.next = dummy4.next;
        return dummy3.next;
    }
	public static void main(String[] args) {
		OddEvenLinkedList o = new OddEvenLinkedList();
		ListNode n1 = o.new ListNode(1);
		ListNode n2 = o.new ListNode(2);
		ListNode n3 = o.new ListNode(3);
		ListNode n4 = o.new ListNode(4);
		ListNode n5 = o.new ListNode(5);
		ListNode n6 = o.new ListNode(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		ListNode temp = o.oddEvenList(n1);
		while(temp !=null){
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		
	}
}
