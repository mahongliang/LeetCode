
public class IntersectionofTwoLinkedLists {

	class ListNode{
		int val;
		ListNode next;
		public ListNode(int val) {
			this.val= val;
			next=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=0,lengthB=0;
        ListNode temp = headA;
        while(temp !=null){
        	lengthA++;
        	temp = temp.next;
        }
        temp = headB;
        while(temp !=null){
        	lengthB++;
        	temp = temp.next;
        }
        
        if (lengthA >= lengthB) {
			int cnt = lengthA-lengthB;
			for (int i = 0; i < cnt; i++) {
				headA = headA.next;
			}
		}else {
			int cnt = lengthB-lengthA;
			for (int i = 0; i < cnt; i++) {
				headB = headB.next;
			}
		}
        
        while (headA != null && headB !=null){
        	if (headA.val == headB.val) {
				return headA;
			}        	
        	headA = headA.next;
        	headB = headB.next;
        }
        return null;      
    }

}
