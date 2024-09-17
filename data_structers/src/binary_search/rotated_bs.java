package binary_search;

public class rotated_bs {
 public static void main(String args[]) {
	 int m[]= {3,4,5,6,1,2};
	 int min=mini(m);
	 System.out.print("minimum element = "+min);
 }
 public static int mini(int b[]) {
	 int ans=-1;
	int s=0;
	int e=b.length-1;
	 while (s<e) {
		int m=s+(e-s)/2;
		if (b[m]>b[e]) {
			s=m+1;
		}
		else if(b[m]<=b[e]) {
			
			e=m-1;
		}
	 }
	 return s;
 }
}
