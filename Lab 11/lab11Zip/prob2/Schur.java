package prob2;

import java.util.*;
public class Schur {
	public Schur(){
		
	}

	boolean checkForSum(List<Integer> list, Integer z){
		
		ArrayList<Integer> distinct = new ArrayList<Integer>();
		HashMap<Integer, Integer> alreadyChecked = new HashMap<Integer, Integer>();
		 Integer next=0;
		for(int i = 0; i < list.size(); ++i) {
			next = list.get(i);
			if(!alreadyChecked.containsKey(next)) {
				distinct.add(next);
				alreadyChecked.put(next, next);
			}
		}
		list = distinct;
		for(int i=0;i<list.size()-1;i++)
			if(list.get(i)+list.get(i+1)==z)
				return true;
		return false;
		
	}
	public void removeFastWay() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Schur check=new Schur();
		List<Integer> list=new ArrayList<Integer>();
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 list.add(4);
		 list.add(5);
		 list.add(5);
		 list.add(5);
		 System.out.print(check.checkForSum(list, 6));
		 
		 

	}

}
