package binary_search;
//finding peak in a array [1,2,3,5,8,5,3] ans=8;
public class answer_spaced_qs_bs {
    public static void main(String args[]) {
    	int[] peak= {1,2,3,5,8,5,3};
    	int z=peak_e(peak);
System.out.println("peak = "+z);
    }
    public static int peak_e(int[] arr) {
    	  int s=0;
  	    int e=arr.length-1;
  	    int k=0;
  	    while(s<e){
  	       int m=s+(e-s)/2;
  	        if (arr[m]<arr[m+1]){
  	            s=m+1;
  	           // System.out.println(a[s]);
  	        }
  	        else if(arr[m]>arr[m+1]){
  	            e=m;
  	            // System.out.println(a[e]);
  	        }
  	        if (arr[s]==arr[e]){
  	            k=s;
  	        }
  	       
  	    }
  	   return k;
      }
}
