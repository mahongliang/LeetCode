
public class RemoveLinkedListElements {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	public ListNode removeElements(ListNode head, int val){
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode father = dummy;
		ListNode cuurent = head;
		while(cuurent !=null){
			if (cuurent.val == val) {
				father.next = cuurent.next;
			}else {
				father = cuurent;
			}
			
			cuurent = cuurent.next;		
		}
		return dummy.next;
	}
	public static void main(String[] args) {
		RemoveLinkedListElements r = new RemoveLinkedListElements();
	
		ListNode node1 = r.new ListNode(1);
		
		ListNode temp = r.removeElements(node1, 1);
		System.out.println(temp.val);
	}
}
