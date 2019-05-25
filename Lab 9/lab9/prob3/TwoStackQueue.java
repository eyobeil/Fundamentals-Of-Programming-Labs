package prob3;

import java.util.Stack;

public class TwoStackQueue {
	//replace these Java Stacks with your own implementation from 9-1
	Stack<String> stack1;
	Stack<String> stack2;
	public TwoStackQueue() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	
	/**
	 * Removes and returns element from front of queue
	 */
	public String dequeue() {
		//implement using your stacks
		if (stack1.empty())return null;
		return stack1.pop();
	}
	
	/**
	 * Adds an element to the end of the queue
	 */
	public void enqueue(String s) {
		//implement using your stacks
		if (stack1.empty()){
			stack1.push(s);
		}
		else{
			while (!stack1.empty()){
				stack2.push(stack1.pop());
			}
			    stack1.push(s);
			    while(!stack2.empty()){
			    	stack1.push(stack2.pop());
			}
		}	
	}
	
	/**
	 * Returns but does not remove element at front of queue
	 */
	public String peek() {
	/*	if (!stack2.empty())return null;
		while (!stack1.empty()){
			stack2.push(stack1.pop());
		}*/
		return stack1.peek();
		
	}
	
	/**
	 * Returns number of elements currently in queue
	 */
	public int size() {
		int count=0;
		while (!stack1.empty()){
			stack2.push(stack1.pop());
			count++;
		}
		while (!stack2.empty()){
			stack1.push(stack2.pop());
		}
		return count;
	}
	
	/**
	 * Represents elements of queue in their current order as a String
	 * @param args
	 */
	@Override
	public String toString() {
		String result="";
		while(!stack1.empty()){
			stack2.push(stack1.peek());
			result+=stack1.peek()+" ";
			stack1.pop();
		}
		while(!stack2.empty()){
			stack1.push(stack2.peek());
			stack2.pop();
		}
		
		return result;
	}
	
	//Test your queue with this main method
	public static void main(String[] args) {
		TwoStackQueue queue = new TwoStackQueue();
		queue.enqueue("Bob");
		queue.enqueue("Tom");
		queue.enqueue("George");
		queue.enqueue("Harold");
		System.out.println(queue);
		System.out.println(queue.peek());
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue);
		System.out.println(queue.peek());
		
		
		
	}
	
}
