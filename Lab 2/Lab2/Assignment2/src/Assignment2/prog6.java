package Assignment2;

import java.util.Arrays;

public class prog6 {
	
	public static String[] removeDups(String[] list) {
		String[] temp = new String[list.length];
		int i = 0;	// index distinctList
		for (int j=0;j<list.length;j++) {
			if (linearSearch(temp, list[j]) == -1) {
				temp[i] = list[j];
				i++;
			}
		}
		String [] distinctList=new String[i];
		System.arraycopy(temp, 0, distinctList, 0, i);
		return distinctList;
	}

	public static int linearSearch(String[] array, String key) {
		for (int i = 0; i < array.length; i++) {
			if (key.equals(array[i]))
				return i;
		}
		return -1;
	}
	public static void testRemoveDups() {
		String[]testData= new String[] {"horse", "dog", "cat", "horse","dog"};
		String[] result = prog6.removeDups(testData);
		System.out.println(Arrays.toString(result));
	}
	public static void main(String[] args) {
		testRemoveDups();
	}
}



