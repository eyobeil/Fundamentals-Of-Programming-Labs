package Prob4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		StringLengthComparator com= new StringLengthComparator();
		StringSort a= new StringSort(com);
		String[] tobeSorted= {"Together","Hello","Welcome","Almighty"};
		a.stringSort(tobeSorted);
		System.out.println(Arrays.toString(tobeSorted));

	}

}
