

public class RotateList {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	public ListNode rotateRight(ListNode head, int k) {
		
		if (head==null) {
			return null;
		}
		ListNode dummy = new ListNode(-1);
		dummy.next = head; 
        int cnt = 0;
        
        ListNode current = head;
        while(current != null){
        	cnt++;
        	current = current.next;
        }
        
         k = k%cnt;
         
       ListNode tail = dummy;
       head = dummy;
       for (int i = 0; i < k; i++) {
    	   head = head.next;
       }
       
       while(head.next != null){
    	   head = head.next;
    	   tail = tail.next;
       }
       
       head.next = dummy.next;
       dummy.next = tail.next;
       tail.next = null;
    		   
        return dummy.next;
	}
	
	public static void main(String[] args) {
		RotateList r = new RotateList();
		
		ListNode n1 = r.new ListNode(1);
		ListNode n2 = r.new ListNode(2);
		ListNode n3 = r.new ListNode(3);
		ListNode n4 = r.new ListNode(4);
		ListNode n5 = r.new ListNode(5);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		ListNode root = r.rotateRight(n1, 4);
		while(root != null){
			System.out.print(root.val+" ");
			root = root.next;
		}
		
	}
}
