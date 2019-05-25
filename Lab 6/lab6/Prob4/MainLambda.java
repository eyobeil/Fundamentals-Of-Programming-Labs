package Prob4;

import java.util.Arrays;
public class MainLambda {
	public static void main(String[] args) {
		StringSort a= new StringSort(
				(s1,s2)->
				{
					if(s1.length()<s2.length()) {
						return -1;
					}
					else if(s1.length()>s2.length()) {
						return 1;
					}
					else {
						return 0;
					}
				});
		String[] tobeSorted= {"Together","Hello","Welcome","Almighty"};
		a.stringSort(tobeSorted);
		System.out.println(Arrays.toString(tobeSorted));
	}
}
