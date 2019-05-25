package prob3;

public class BinarySearch {
	public boolean search(String s, char c) {
		int low = 0;
		int high = s.length() - 1;
		char a[]=s.toCharArray();
		return recursiveBinarySearch(a, c, low, high);
	}
	private static boolean recursiveBinarySearch(char []a, char c,
			int low, int high) {
		if (low > high) 
			return false;
		int m = (low + high) / 2;
		if (c < a[m])
			return recursiveBinarySearch(a, c, low, m - 1);
		else if (c == a[m])
			return true;
		else
			return recursiveBinarySearch(a, c, m + 1, high);
	}
	public static void main(String[] args) {
	BinarySearch a= new BinarySearch();
	System.out.println(a.search("abdfh", 'a'));
	System.out.println(a.search("abdfh", 'n'));
	
	}
}


