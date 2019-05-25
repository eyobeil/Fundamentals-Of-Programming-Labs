package prob3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import prob3.MyBST.Node;;
public class BSTSort extends Sorter {
	MyBST bst;
	public void insertAll(int[] array){
		bst= new MyBST();
		for(int i=0;i<array.length;i++) {
			bst.insert(array[i]);
		}
		}
	
	
	public List <Integer>print() {
		return bst.printTree();
	}
	
	public int[] readIntoArray() {
		List<Integer>list= new ArrayList<Integer>();
		list=bst.printTree();
		int a[]= new int[list.size()];
		for(int i=0;i<a.length;i++) {
		a[i]= list.get(i);}
		return a;
		}
	@Override
	public int[] sort(int[] arr) {
		insertAll(arr);
		int a[]=readIntoArray();
		return a;
	}
	public static void main(String[] args) {
		BSTSort bs= new BSTSort();
		System.out.println(Arrays.toString(bs.sort(new int [] {1,3,2,4,6,5})));
	
	}


	

}
