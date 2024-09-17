package binary_search;
//video-3
public class peak {
	public static void main(String args[]) {
		int[] s= {1,2,3,4,12,3,2};
		int min=findmin(s);
		System.out.println("minimum index in bitonic array = "+min);
		int max=findmax(s);
		System.out.println("maximum index in bitonic array = "+max);
	}
	public static int findmin(int[] a) {
		if (a.length==0) {
			return 0;
		}
		else if(a.length==1) {
			return 1;
		}
		else {
		int a1=a[0];
		int l=a[a.length-1];
		
		int ans=a1>l?l:a1;//compare both ends of array then which is less store that value
		return ans;//return less value
		}
	}
	public static int findmax(int[] a) {
		if (a.length==0) {
			return 0;
		}
		else if(a.length==1) {
			return 1;
		}
		else {
		int s=a[0];
		int e=a.length-1;
		int ans=-1;
		int n=a.length;
		while (s<=e) {
			int m=s+((e-s)/2);
			int p=((m-1+n)%n);
			int ne=(m+1)%n;
			if (a[m]>a[p] && a[m]>a[ne]) {
				ans=m;
				break;
			}
			else if(a[m]>a[p]) {
				s=m+1;
			}
			else if(a[m]>a[ne]) {
				e=m-1;
			}
		}
		return ans;//return less value
		}
	}

}
