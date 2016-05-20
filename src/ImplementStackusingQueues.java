import java.util.LinkedList;
import java.util.Queue;


public class ImplementStackusingQueues {
	
	
	//myslover onequeue push(1) pop(n)
//	class MyStack {
//		private Queue<Integer> queue =  new LinkedList<Integer>();	
//	    // Push element x onto stack.
//	    public void push(int x) {
//	        queue.offer(x);
//	    }
//
//	    // Removes the element on top of the stack.
//	    public void pop() {
//	        int size = queue.size();
//	        for (int i = 1; i < size; i++) {
//				queue.offer(queue.poll());
//			}
//	        queue.poll();
//	    }
//
//	    // Get the top element.
//	    public int top() {
//	    	int size = queue.size();
//	        for (int i = 1; i < size; i++) {
//				queue.offer(queue.poll());
//			}
//	        int top = queue.peek();
//	        queue.offer(queue.poll());
//	        return top;
//	    }
//
//	    // Return whether the stack is empty.
//	    public boolean empty() {
//	        return queue.isEmpty();
//	    }
//	}
	
	
	//one queue
//	class Mystack{
//		Queue<Integer> q = new LinkedList<Integer>();
//		public void push(int x){
//			q.add(x);
//			int sz = q.size();
//			while (sz >1) {
//				q.add(q.remove());
//				sz--;			
//			}
//		}
//		public void pop(){
//			q.remove();
//		}
//		public int top(){
//			return q.peek();
//		}
//		public boolean empty(){
//			return q.isEmpty();
//		}
//	}
	
	// two queue
	class Mystack{
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		int top;
		public void push(int x){
			q2.add(x);
			top = x;
			while (!q1.isEmpty()) {
				q2.add(q1.remove());			
			}
			Queue<Integer> temp = q1;
			q1 = q2;
			q2 = temp;
		}
		public void pop(){
			q1.remove();
			if (!q1.isEmpty()) {
				top = q1.peek();
			}
		}
		public int top(){
			return top;
		}
		public boolean empty(){
			return q1.isEmpty();
		}
	}
}
