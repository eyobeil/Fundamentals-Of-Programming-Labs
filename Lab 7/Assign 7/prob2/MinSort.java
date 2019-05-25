package prob2;

public class MinSort {
	public String sort(String str) {
		int index= str.indexOf(minChar(str));
		char c= str.charAt(index);
		char chars[]= str.toCharArray();
		char temp=' ';
		temp= chars[0];
		chars[0]=chars[index];
		chars[index]=temp;
		String value=String.copyValueOf(chars);
		StringBuilder sb= new StringBuilder(value);
		sb.deleteCharAt(index);
		String t=sb.toString();
		StringBuilder res= new StringBuilder();
		res.append(sorts(t));
		res.append(c);
		return res.toString();
	}
	public Character minChar(String s) {
		if(s==null||s.isEmpty()) return null;
		char a= s.charAt(0);
		if(s.length()==1) {
			return a;
		}
		char c= minChar(s.substring(1));
		return a<c?a:c;
	}
	private static char[] sort(char[] a, int low, int high) {
		if (low < high) {
			// Find the smallest number and its index in list[low .. high]
			int indexOfMin = low;
			char min = a[low];
			for (int i = low + 1; i <= high; i++) {
				if (a[i] < min) {
					min = a[i];
					indexOfMin = i;
				}
			}

			// Swap the smallest in list[low .. high] with list[low]
			a[indexOfMin] = a[low];
			a[low] = min;
			// Sort the remaining list[low+1 .. high]
			sort(a, low + 1, high);
		}
		return a;
	}
	private String sorts(String s) {
		char a[]=s.toCharArray();
		sort(a,0,s.length()-1);
		return String.copyValueOf(a);
	}
	
}