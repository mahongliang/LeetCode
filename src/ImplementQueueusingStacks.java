import java.util.Stack;


public class ImplementQueueusingStacks {
	
	//myslover
//	class MyQueue {
//		Stack<Integer> stack1 = new Stack<Integer>();
//		Stack<Integer> stack2 = new Stack<Integer>();
//		int top;
//	    // Push element x to the back of queue.
//	    public void push(int x) {
//	    	if (stack1.size() == 0) {
//				top = x;
//			}
//	        stack1.push(x);
//	    }
//
//	    // Removes the element from in front of queue.
//	    public void pop() {
//	        while (!stack1.isEmpty()) {
//				stack2.push(stack1.pop());
//			}
//	        stack2.pop();
//	        if(!stack2.isEmpty())
//	            top = stack2.peek();
//	        while (!stack2.isEmpty()) {
//				stack1.push(stack2.pop());
//			}
//	        
//	    }
//
//	    // Get the front element.
//	    public int peek() {
//	    	 return top;
//	    }
//
//	    // Return whether the queue is empty.
//	    public boolean empty() {
//	        return stack1.isEmpty();
//	    }
//	}
	
	class MyQueue {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		int top;
	    // Push element x to the back of queue.
	    public void push(int x) {
	    	if (stack1.isEmpty()) {
				top = x;
			}
	    	while(!stack1.isEmpty()){
	    		stack2.push(stack1.pop());
	    	}
	    	stack1.push(x);
	    	while(!stack2.isEmpty()){
	    		stack1.push(stack2.pop());
	    	}
	    	
	    }

	    // Removes the element from in front of queue.
	    public void pop() {	        
	        stack1.pop();
	        if (!stack1.isEmpty()) {
				top = stack1.peek();
			}
	    }

	    // Get the front element.
	    public int peek() {
	    	 return top;
	    }

	    // Return whether the queue is empty.
	    public boolean empty() {
	        return stack1.isEmpty();
	    }
}

}
