package queue;

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;
	
	/* stores the element at the end of the queue, if it exists */
	private Node tail;
	
	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		Node newNode= new Node();
		newNode.data=s;
		if(head==null) {
			head=newNode;
		}
		else {
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
	    // tail=current;
	     current.next=newNode;
	      tail= newNode;
	}	}
	/**
	 * Removes node from the front of the queue and returns its value if
	 * head is n
	 */
	public String dequeue() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		if(head.next==null) {
			String temp= head.data;
			head=null;
			//tail=null;
			return temp;
		    }
			String temp= head.data;
			  //head=null;
		      head=head.next;
		      return temp;
	}	
	/**
	 * Returns value stored at the front of the queue
	 * @return
	 * @throws QueueException
	 */
	public String peek() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		return head.data;
	}
	public boolean isEmpty() {
		return head == null;
	}
	@Override
	public String toString() {
		if(isEmpty()) return "<empty queue>";
		return head.toString();
	}
}


