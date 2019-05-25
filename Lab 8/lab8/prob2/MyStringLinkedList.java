package prob2;

public class MyStringLinkedList {
	Node header;
	MyStringLinkedList(){
		header = new Node(null,null, null);
	}
	public void addFirst(String item){
		Node n = new Node(header.next,header,item);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
		
	}
	public int size() {
		Node current= header;
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	public void insert(String data, int pos) {
		Node n= new Node(null,null,data);
		if(pos<0||pos>size()) return ;
		if(pos==0) {
			addFirst(data);
			return;}
		int count=-1;
		Node current=header;
		while(current.next!=null) {
			count++;
			if(count==pos) {
				break;
			}
			current=current.next;
		}
		if(current.next!=null) {
			n.next=current.next;
			current.next=n;
			return;
		}
		else {
			current.next=n;
			n.previous=current;
			return;
		}
		
	}
	boolean searchNode(String val){
		if (val == null){ System.out.print( "\n"+ val +" is invalid");
			return  false;}
		Node startNode = header.next;
		Node cnode = startNode;
		while( cnode != null){
			String cnv = cnode.value;
			if(cnv.equalsIgnoreCase(val)){
				return true;
			}
			cnode = cnode.next;
		}
		return false;
	}
	public boolean removeFirst(){
		if (header.next==null){
			return false;
		}
	 Node temp=header.next;
	 header.next=temp.next;
		if (temp.next!=null){
			temp.next.previous=header;
		}
		temp=null;
		return true;
	}
		
	void printNodes() {
		Node next = header.next;
		if(next == null) System.out.println("");
		else {
			String s= next.toString();
			System.out.println(s);
		}
	}
	class Node {
		String value;
		Node next;
		Node previous;
		Node(Node next, Node previous, String value){
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
		@Override
		public String toString() {
		    if(value == null) return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}
		private StringBuilder toString(StringBuilder sb, Node n) {
			if(n == null) return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}
		
		
	}
	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		list.addFirst("big");
		list.addFirst("small");
		list.addFirst("tall");
		list.addFirst("short");
		list.addFirst("round");
		list.addFirst("square");
		list.addFirst("enormous");
		list.addFirst("tiny");
		list.addFirst("gargantuan");
		list.addFirst("lilliputian");
		list.addFirst("numberless");
		list.addFirst("none");
		list.addFirst("vast");
		list.addFirst("miniscule");
		//list.insert("null", 14);
		System.out.println(list.removeFirst());
		list.printNodes();
		System.out.println(list.searchNode("tiny"));
		System.out.println(list.searchNode("number"));
	}
}


