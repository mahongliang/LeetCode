import java.util.ArrayList;


public class AddTwoNumbers {
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {
			val = x;
		}
	}
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(9);
		
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(9);
		ListNode l13 = new ListNode(9);
		ListNode l14 = new ListNode(9);
		ListNode l15 = new ListNode(9);
		ListNode l16 = new ListNode(9);
		ListNode l17 = new ListNode(9);
		ListNode l18 = new ListNode(9);
		ListNode l19 = new ListNode(9);
		ListNode l120 = new ListNode(9);

		l11.next = l12;
		l12.next = l13;
		l13.next = l14;
		l14.next = l15;
		l15.next = l16;
		l16.next = l17;
		l17.next = l18;
		l18.next = l19;
		l19.next = l120;

		
		ListNode node = addTwoNumbers(l1,l11);
		while (node != null) {
			System.out.println(node.val+"->");
			node = node.next;	
		}
	}
	
	//TC O(max(m,n))
	//SC O(max(m,n))
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry=0;
		while(p != null || q != null){
			int x = (p!=null) ? p.val:0;
			int y = (q!=null) ? q.val:0;
			int sum = x+y+carry;
			carry = sum/10;
			curr.next = new ListNode(sum%10);
			curr = curr.next;
			if (p != null) p = p.next;
			if (q != null) q = q.next;
		}
		if (carry > 0 ) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}
//	public static ListNode addTowNumbers(ListNode l1, ListNode l2){
//		long a = getNumber(l1);
//		long b = getNumber(l2);
//		long c = a + b;
//		
//		return getListNode(c);
//		
//	}
//	
//	public static ListNode getListNode(long c){
//		ArrayList<Integer> mylist = new ArrayList<Integer>();
//
//		if (c < 10) {
//			return new ListNode((int)c);
//		}
//		long temp = c;
//		long val=0;
//		while(temp != 0){
//			val = temp%10;
//			temp = temp/10;
//			mylist.add((int)val);		
//		}
//		
//		ListNode list = new ListNode(mylist.get(0));
//		ListNode templist = list;
//		for (int i = 1; i < mylist.size(); i++) {
//			ListNode next = new ListNode(mylist.get(i));
//			templist.next = next;		
//			templist = next;
//		}
//		
//		
//		
//		return list;
//		
//	}
//	public static long getNumber(ListNode list){
//		ArrayList<Integer> mylist = new ArrayList<Integer>();
//		
//		while(list != null){
//			mylist.add(list.val);
//			list = list.next;		
//		}
//		
//		long sum = 0;
//		for (int i = mylist.size()-1; i >= 0; i--) {
//			int a = mylist.get(i);
//			sum = 10*sum + a;
//		}
//		return sum;
//	}
	
}
