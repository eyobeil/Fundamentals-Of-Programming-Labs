package prob1;

public class MyStringStack {
MyStringLinkedList name=new MyStringLinkedList();

public MyStringStack(){
	//TODO Auto-generated constructor stub
}
void push (String s){
	name.add(s);
}
String pop(){
	String val=name.findKth(0);
	name.removeNode(0);
	return val;
}
String peek(){
	return name.findKth(0);
}
public static void main(String[] args){
	MyStringStack stack=new MyStringStack();
	stack.push("Bob");
	stack.push("Harry");
	stack.push("Alice");
	System.out.println("Popping..."+stack.pop());
	System.out.println("Peeking..."+stack.peek());
	System.out.println("Popping..."+stack.pop());
	System.out.println("Peeking..."+stack.peek());
	System.out.println("Popping..."+stack.pop());
}
}
