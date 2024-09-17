package binary_search;
//this is video 1 of bs of seshwath tiwari
public class binary_search_basic_program {
	public static void main(String args[])
	{
	int[] a= {7,9,45,78,90,97,98,99};
	int k=97;
	int e=binary_search(a,k);
	System.out.println("ascending order"+e);
	int[] c= {100,97,90,89,87,67,56,45,34,23,12};
	int e1=binary_search_decrease(c,k);
	System.out.println("descindin order"+e1);
	
	int b=orderagnostic(a,k);
	System.out.println("ascending order"+e);
	int y=orderagnostic(c,k);
	System.out.println("descindin order"+y);
	
	}
	//orderagnostic used when don't know order of array
	public static int orderagnostic(int[] w,int r) {
		int s=0;
		int e=w.length-1;
		if (w[s]>w[e]) {
		int t=binary_search_decrease(w,r);
		return t;
		}
		else if(w[e]>w[s]) {
			int q=binary_search(w,r);
			return q;
		}
		return s;
	}
	//ascending binary search
	public static int binary_search(int[] b,int key) {
		int s=0;
		int e=b.length-1;
		while(s<=e) {
			int m=s+((e-s)/2);
			if (b[m]==key) {
				return m;
			}
			else if (b[m]>key) {
				e=m-1;
			}
			else {
				s=m+1;
			}
		}
		//this statement excute when above return stmt does not return any value then this will return
			return -1;		
	}
	//decresing binary_search
	public static int binary_search_decrease(int[] b,int key) {
		int s=0;
		int e=b.length-1;
		while(s<=e) {
			int m=s+((e-s)/2);
			if (b[m]==key) {
				return m;
			}
			else if (b[m]>key) {
				s=m+1;
			}
			else {
				e=m-1;
			}
		}
		//this statement excute when above return stmt does not return any value then this will return
			return -1;		
	}
}
