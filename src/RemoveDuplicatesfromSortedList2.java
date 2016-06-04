
public class RemoveDuplicatesfromSortedList2 {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode parent = dummy;
        int lastval = Integer.MIN_VALUE;
        while(head != null && head.next != null){
        	if (head.val == head.next.val) {
        		lastval = head.val;
				parent.next = head.next.next;
				head = head.next.next;
			}else {
				
				if (lastval == head.val) {
					parent.next = head.next;
					head = head.next;
				}else {
					head = head.next;
					parent = parent.next;
				}
			}
        }
        
        while(parent.next != null && parent.next.val == lastval ){
        	parent.next = parent.next.next;
        }
        
        return dummy.next;
    }
	public static void main(String[] args) {
		RemoveDuplicatesfromSortedList2 r = new RemoveDuplicatesfromSortedList2();
		ListNode n1 = r.new ListNode(1);
		ListNode n2 = r.new ListNode(1);
		ListNode n3 = r.new ListNode(1);
		ListNode n4 = r.new ListNode(2);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		ListNode temp = r.deleteDuplicates(n1);
		if (temp == null) {
			System.out.println("null");
		}else {
			System.out.println(temp.val);
		}
	}
}
