package Prob4;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {

	public static void main(String[] args) {
		
	StringSort com=	new StringSort(new Comparator<String>() {
             @Override
			public int compare(String s1, String s2) {
            	 if(s1.length()>s2.length())
         			return 1;
         		else if(s1.length()<s2.length())
         			return -1;
         		else return 0;
			}
			});
	   String[] tobeSorted= {"Together","Hello","Welcome","Almighty"};
	    com.stringSort(tobeSorted);
	   System.out.println(Arrays.toString(tobeSorted));

	}
	

}
