package prob1;

//import lab9_1Collected.MyStringLinkedList.Node;

public class MyStringLinkedList {
	Node header;
	MyStringLinkedList(){
		header = new Node(null,null, null);
		
//		System.out.println("header constructor\n");
	}
	//adds to the front of the list
	public void add(String item){
		Node n = new Node(header.next,header,item);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
		
//		System.out.printf("item:     %s  ,  added with nextNode:      %s     ,  with previouseNode:    %s\n",item, n.next, n.previous);
		
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node next = header.next;
		while(next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		String result = sb.toString();
		if(result.charAt(result.length()-1) == ',') {
			return result.substring(0,result.length()-1);
		}
		return result;
		
		
	}
	
	boolean searchNode(String val){
		if (val == null){ System.out.print( "\n"+ val +" is invalid");
			return  false;}
		Node startNode = header.next;
		Node cnode = startNode;
		while( cnode != null){
//			System.out.printf("\n node:   %s",cnode);
			String cnv = cnode.value;
			if(cnv.equalsIgnoreCase(val)){
				System.out.printf("\n found at node:  %s",cnode);
				return true;
			}
			cnode = cnode.next;
		}
		 System.out.print( "\n"+ val +" is not in the list, Sorry....");
		return false;
	}
	void removeNode(int pos){
		
		if (pos == 0 && header.next==null){return;}
		if (pos == 0 && header.next.next ==null ){header.next = null;return;}
		if (pos == 0 && header.next.next !=null ){header.next = header.next.next;return;}
		
		Node startNode = header.next;
		Node preNode = startNode;
		Node cNode = startNode.next;
		int index = 0;
		while(cNode != null){
			index +=1;
//			System.out.printf("\n node:   %s  preNode:  %s  , nextNode:  %s",cNode,cNode.previous,cNode.next);
			if( index == pos){
				if(cNode.next == null){preNode.next = null;}
				else{preNode.next = cNode.next;}
				return;
			}
			preNode = cNode;
			if( cNode.next == null && pos>index){
				System.out.println("\n the position  "+pos + "  is beyond the list there is nothing to remove ");
			}
			cNode = cNode.next;
		}
	}
	
	void removeNode(String val){
		
		if( val == null)return;
		Node startNode = header.next;
		if( startNode != null && startNode.value.equalsIgnoreCase(val)){
			startNode = startNode.next; return;
		}
		Node preNode = startNode;
		Node cNode = startNode.next;
		while(cNode != null){
			System.out.printf("\n node:   %s  preNode:  %s  , nextNode:  %s",cNode,cNode.previous,cNode.next);
			if( val.equalsIgnoreCase(cNode.value)){
				preNode.next = cNode.next; return;
			}
			preNode = cNode;
			cNode = cNode.next;
		}
	}
	
	void insertNode(String val, int pos){
		if( val == null ) {System.out.println("\n val is null \n");return;}
		if (pos == 0){add(val);}
		Node startNode = header.next;
		Node preNode = startNode;
		Node cNode = startNode.next;
		int index = 0;
		while(cNode != null){
			index +=1;
//			System.out.printf("\n node:   %s  preNode:  %s  , nextNode:  %s",cNode,cNode.previous,cNode.next);
			if( index == pos){
				Node n = new Node(cNode , preNode ,val);
				preNode.next = n;
				cNode.previous = n; 
				System.out.println("\n"+n.value + " added to position " + pos);
				return;
			}
			preNode = cNode;
			if( cNode.next == null && pos>=index){
				Node n = new Node(null , cNode ,val);
				cNode.next = n;
				System.out.println("\n"+n.value + " added to position last ");
				cNode = n;

			}
			cNode = cNode.next;
		}
	}
	
	String findKth(int pos){
		Node startNode = header.next;
		if( pos <0 ){return null;}
		if( pos ==0 ){return startNode.value;}
//		Node preNode = startNode;
		Node cNode = startNode.next;
		int index = 0;
		while(cNode != null){
			index +=1;
//			System.out.printf("\n node:   %s  preNode:  %s  , nextNode:  %s",cNode,cNode.previous,cNode.next);
			if( index == pos){
				return cNode.value;
			}
			cNode = cNode.next;
		}
		return null;
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
		
		public String toString() {
			return value == null ? "null" : value;
		}
	}
}
