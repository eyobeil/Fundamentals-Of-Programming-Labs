package prob3.EmployeeInfo;

import java.util.Arrays;

public class AccountList {

	private final int INITIAL_LENGTH = 50;
	private Account[] actArray; 
	private int size;
	
	public AccountList() {
		actArray = new Account[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Account act){
		//implement
		if(size >= actArray.length){
			resize();
		}
		actArray[size] = act;
		size++;
	}
	
	public Account get(int i){
		//implement
		if(i>= size){
			return null;
		}
		return actArray[i];
	}
	
	public boolean find(Account act){
		//implemement
		for(Account account: actArray){
			if(act.equals(account)){
				return true;
			}
		}
		return false;
	}
	
	public void insert(Account act, int pos){
		//implement
		if(pos>=size){
			return;
		}
		actArray[pos] = act;
	}
	
	public boolean remove(Account act){
		//implement
		int fetchCounter = 0;
		boolean found = false;
		while(fetchCounter < size && !found){
			if(actArray[fetchCounter].equals(act)){
				found = true;
			}
			fetchCounter++;
		}
		if(!found){
			return false;	
		}
		else{
			removeCopy(fetchCounter-1);
			size--;
			return true;
		}		
	}
	
	private void removeCopy(int elementPosition){
		if(elementPosition>= actArray.length){
			return;
		}
		if(elementPosition < (actArray.length-1)){
			for(int counter = elementPosition;counter < (actArray.length-1);counter++){
				actArray[counter] = actArray[counter + 1];
			}
		}
		actArray[actArray.length-1] = null;
	}
	
	private void resize(){
		//implement
		Account[] tempArray = new Account[size*2];
		for(int counter = 0; counter < size; counter++){
			tempArray[counter] = actArray[counter];
		}
		actArray = tempArray;
	}
	public String toString(){
		//implement
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int counter =0; counter <size;counter++){
			if(0 != counter){
				sb.append(" ");
			}
			sb.append(actArray[counter]);
			if(counter != (size-1)){
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	public int size() {
		return size;
	}

}
