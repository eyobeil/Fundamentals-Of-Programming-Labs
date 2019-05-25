package prob4;

public class DivideSort {
	public String divideSort(String s) {
		char str []= s.toCharArray();
		int end=s.length()-1;
		return  sort(str,0,end);
	}
	public static String sort(char a[], int start, int end) {
		if(start>=end) {
			return null;
		}
		int mid=(start+end)/2;
		sort(a,start,mid);
		sort(a,mid+1,end);
		return merge(a,start,mid,end);

	}
	public static  String merge(char a[], int start, int mid, int end) {
		char[] temp= new char[end-start+1];
		int sleft=start;
		int sright=mid+1;
		int k=0;
		while(sleft<=mid&&sright<=end) {
			if(a[sleft]<a[sright]) {
				temp[k]=a[sleft];
				sleft++;
			}
			else {
				temp[k]=a[sright];
				sright++;
			}
			k++;
		}
		if(sleft<=mid) {
			while(sleft<=mid) {
				temp[k]=a[sleft];
				sleft++;
				k++;
			}}
		else if(sright<=end) {
			while(sright<=end) {
				temp[k]=a[sright];
				sright++;
				k++;
			}
		}
		for(int i=0;i<temp.length;i++) {
			a[start+i]=temp[i];
		}
		return String.copyValueOf(temp);
	}
	public static void main(String[] args) {
		DivideSort a= new DivideSort();
		System.out.println(a.divideSort("emanuel"));
	}

}
